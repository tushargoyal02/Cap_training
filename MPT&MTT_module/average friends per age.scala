// published file in databricks - >>>> https://databricks-prod-cloudfront.cloud.databricks.com/public/4027ec902e239c93eaaa8714f173bcfc/931328135249323/3945950373234091/5764242340617371/latest.html


// Databricks notebook source
// Importing the main spark library
import org.apache.spark._



// this function is to split data into individual columns

def parseLine(line: String) = {
      // Split by commas
  val fields = line.split(",")
      // Extract the age and numFriends fields, and convert to integers
  val age = fields(2).toInt
  val numFriends = fields(3).toInt
      // Create a tuple that is our result.
      (age, numFriends)
  }



  
 // Load each line of the source data into an RDD
  val lines = sc.textFile("/FileStore/tables/fakefriends.csv")
    
    // Use our parseLines function to convert to (age, numFriends) tuples
  val rdd = lines.map(parseLine)
  
  val totalsByAge = rdd.mapValues(x => (x, 1)).reduceByKey( (x,y) => (x._1 + y._1, x._2 + y._2))
   
    // computing average we divide totalFriends / totalInstances for each age.
  val averagesByAge = totalsByAge.mapValues(x => x._1 / x._2)
    
    // Collect the results from the RDD (This kicks off computing the DAG and actually executes the job)
  val results = averagesByAge.collect()
    
    // Sort and print the final results.
  results.sorted.foreach(println)





