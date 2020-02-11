// DAtabricks file - https://databricks-prod-cloudfront.cloud.databricks.com/public/4027ec902e239c93eaaa8714f173bcfc/931328135249323/598262283325630/5764242340617371/latest.html



// Databricks notebook source
def data(lines:String) = {
  val fields = lines.split(",")
  val age = fields(2).toInt
  val numFriends = fields(3).toInt
  (age,numFriends)
  
}

// COMMAND ----------

val lines = sc.textFile("/FileStore/tables/fakefriends.csv")

// COMMAND ----------

val rdd = lines.map(data)

// COMMAND ----------

rdd.take(1)

// COMMAND ----------

//rdd.take(1)

rdd.map( x => (x,1) ).reduceByKey(_+_).collect()

// COMMAND ----------

rdd.map(x => (x,1)).take(2)

// COMMAND ----------

// using new mapvalue function

val new1 = rdd.mapValues( x => (x,1))

new1.collect()

// COMMAND ----------

val new4 = new1.reduceByKey( (x,y) => (x._1 + y._1 ,  x._2+y._2)  )
new4.collect()

// COMMAND ----------

new4.mapValues( x => x._1 / x._2  ).collect()

// COMMAND ----------

val rdd4 = sc.parallelize(Array( ("tushar",30) , ("goyal",22), ("tushar",60)) )
// rdd4.collect()
 rdd4.reduceByKey( _+_ ).collect()
