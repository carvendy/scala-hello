package com.carvendy.hello_scala

object TestMutableMap {
  def main(args: Array[String]): Unit = {
    
    var muMap = Map[Int,String]() 
    muMap += (1 -> "one")
    muMap += (3 -> "three")
    muMap += (4 -> "four")
    
    println(muMap(3))
  }
}