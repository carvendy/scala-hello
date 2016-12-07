package com.carvendy.hello.scala

object TestEquals {
  
  
  def main(args: Array[String]): Unit = {
    
    println( 1 == 3)
    println( 1 == 1.0)
    println( List(1,2,3) == List(1,2,3))
   
    println(("ha"+"h"+"a") == "haha")
  }
}