Databricks published : https://databricks-prod-cloudfront.cloud.databricks.com/public/4027ec902e239c93eaaa8714f173bcfc/931328135249323/2650055252110402/5764242340617371/latest.html

// Databricks notebook source
val hello: String = "hey!"
println(hello)

// COMMAND ----------

hello = hey! + "hey baby"

// COMMAND ----------

var x = "good"
//x
x= x + "morning"
x

// COMMAND ----------

val numI: Int =3
//numI
val boole: Boolean = true
//boole
val pi : Double = 3.212131231232
//pi

val small : Byte = 126
//small

println(f"hey $pi ")

// COMMAND ----------

val intcon = small.toInt
intcon

// COMMAND ----------

val g = true
val l = false

// single & mean evaluate both
//g & l

//check for the first if 1st false then not the second one
g && l 

// COMMAND ----------

val n = 2
n match {
  case 1 => println("1")
  case 2 => println("2")
  case _ => print("nothing")
}

// COMMAND ----------

for (x <- 1 to 4){
  val sq = x * x
  println(sq)  
}

// COMMAND ----------

var x = 10
while(x >= 0){
  println(x)
  x=x-1
}

// COMMAND ----------

println({var x=10 ; x+20})

// COMMAND ----------

// FUNCTIOns
// def <name>(<parameter name : type>) : return type = {expression}
def squareI(x : Int): Int= {
  x * x
}
squareI(2)




// passing function as argument
def tran(x: Int, f: Int => Int): Int = {
  f(x)
}

tran(4,squareI)


// anonymous function 
tran(3, x=> x*x*x*x)

// COMMAND ----------

// tuples
val tup = ("pic","image","audio")
//println(tup)
println(tup._2)

// COMMAND ----------

//key - value pairs
val keyVal = 1 -> "hey"
keyVal._1


// COMMAND ----------

// List - here contain only 1 single data type
val listi = List("hey","hello")


listi.head   //getting the first values


// COMMAND ----------

var mapList = listi.map( (x:String) => {x.reverse} )

// COMMAND ----------

val newLi = List(1,2,3,4,5)
newLi.reduce( (x:Int, y:Int) => x+y )

// COMMAND ----------

val fil = newLi.filter( (x:Int) => x!=5 )

// COMMAND ----------

val newLi2 = List(1,2,3)
val new3 = newLi ++ newLi2

new3.max

// COMMAND ----------


