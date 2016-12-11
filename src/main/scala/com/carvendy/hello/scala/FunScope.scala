package com.carvendy.hello.scala

object FunScope {
  
  def main(args: Array[String]): Unit = {
    val a =1
   // val a =2 //编译不通过
    
    val b = 1
    while(true){
      val b =2 //通过
    }
  }
  
}