package com.carvendy.hello.scala

object TestOperator {
  
  def main(args: Array[String]): Unit = {
    val num = -8
    val n = 7 toLong
    val doubleN = 1.0
    
    println(getNumber(n))
    println(getNumber(num))
    //println(getNumber(doubleN))报错
    
    
  }
  
  
  def getNumber(n:Long): String ={
    return n + ""
  } 
  
}