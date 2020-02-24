// Databricks notebook source  -->>>  https://databricks-prod-cloudfront.cloud.databricks.com/public/4027ec902e239c93eaaa8714f173bcfc/931328135249323/3945950373234089/5764242340617371/latest.html

// Data is present in the format (station Id, timestamp, temperature type, temperature in farenahit )

import org.apache.spark._
import scala.math.max


// COMMAND ----------

// Find the maximum temperature by weather station for a year 
  
  def parseLine(line:String)= {
    val fields = line.split(",")
    val stationID = fields(0)
    val entryType = fields(2)

//converting the temperatire from F to celsius
    val temperature = fields(3).toFloat * 0.1f * (9.0f / 5.0f) + 32.0f
    (stationID, entryType, temperature)
  }

// COMMAND ----------

   
    val lines = sc.textFile("/FileStore/tables/1800.csv")
    
    val parsedLines = lines.map(parseLine)
    
    val maxTemps = parsedLines.filter(x => x._2 == "TMAX")
    maxTemps.collect()
    val stationTemps = maxTemps.map(x => (x._1, x._3.toFloat))
    
    val maxTempsByStation = stationTemps.reduceByKey( (x,y) => max(x,y))
    val results = maxTempsByStation.collect()
    
    for (result <- results.sorted) {
       val station = result._1
       val temp = result._2
       val formattedTemp = f"$temp%.2f F"
      
      // station with max temperature are :
       println(s"$station max temperature: $formattedTemp") 
    }


