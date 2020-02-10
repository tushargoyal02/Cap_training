// Databricks notebook source
// val , var
val variable1: String = "hello world!"

// COMMAND ----------

var variable1_var : String = "hello worrlllllllldd 2"
variable1_var


// COMMAND ----------

var valuu1 = "hello"

// COMMAND ----------

val variable1 = "hey"
variable1 = "hey" + "world!"

// COMMAND ----------

var value2 = "hey"
value2 = "hey" + "world!"

// COMMAND ----------


val var_byte : Byte = 126
val val_int : Int = 2



// COMMAND ----------

print(f"hello, $val_int")

// COMMAND ----------

// switch statement
var n: Int =3
n match{
  case 1 => print("1")
  case 2 => print("2")
  case 3 => print("Holla found value 3")
  case _ => print("Not found")
}

// COMMAND ----------

var a =2
if(a==2){
  println("value 2")
}
else{
  print("no value")
}

// COMMAND ----------

for ( i <- 1 to 4){
  println(i)
}

// COMMAND ----------

var wh = 4
while(wh >= 0)
{
  println(f"wh,$wh")
  wh= wh-1
}

// COMMAND ----------

/*function def <name>(argument : <Type>) Retrun datatype Int :{

  commands 
}
*/
def squareInt(x : Int): Int = {
  // squaring the given value
  x * x
}

// calling a function
squareInt(2)

// COMMAND ----------

def third(y: Int, func : Int => Int): Int =
{
  func(y)
}
third(4, squareInt)

// COMMAND ----------

/* make a function paramter (x,y) of type double 
  and return type is double
  2 Inside this function diveide x+y

3 Declare a new function with name "addNumber" 
  Three arguments should be there with name variable1, variable 2
  and func and return should be double for everyone
  
  Inside it call the first function you have made

4 call the function "addNumber" with its arguments
*/

// COMMAND ----------

// working with tupes
val tup = ("hello","goyal",4)
tup._1

// COMMAND ----------

var list1 = List("tushar","goyal")
list1.head

// COMMAND ----------

var dict = 1 -> "hello"

dict._2

// COMMAND ----------

var list1 = List(1,2,3)
var list2 = List(4,5)


list1 ++ list2

// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.filter( (x:Int) => x!=3 )

// COMMAND ----------

var liststring = List("hey","hello")
liststring.map( (x:String) => x.length )

// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.reduce( (x:Int, y:Int) => x+y )

// COMMAND ----------

var list6 = List("hey","tushar","class","is","boring")
list6(0).map( (x:String) => (x,1) )

// COMMAND ----------

var ss : Byte = 124
ss.toString
