package com.carvendy.hello.scala

object TestOperator {
  
  def main(args: Array[String]): Unit = {
    val num = -8
    val n = 7 toLong
    val doubleN = 1.0
    
    println(getNumber(n))
    println(getNumber(num))
    //println(getNumber(doubleN))报错
    val a =  +1
    val aa = 1.unary_+
    val b= 1.unary_~
    println("aa:"+aa+",b"+b)
  }
  
  
  def getNumber(n:Long): String ={
    return n + ""
  } 
  
}