package com.carvendy.hello.scala

import scala.collection.mutable.Map

class CheckSum {
  /*不写默认为public*/
  private var sum = 0

  /*def add(b: Byte) : Unit = {
    //sum = sum + b
     sum +=  b
  }
  
  def checksum(): Int ={
     return ~ (sum & 0xFF) + 1
  }*/

  def add(b: Byte): Unit = sum = sum + b
  def checksum(): Int = return ~(sum & 0xFF) + 1

}

/**
 *  类和伴生对象
 */
object CheckSum {
  private val cache = Map[String, Integer]()
  def calculate(s: String): Int = {
    if (cache.contains(s)) {
      cache(s)
    } else {
      val acc = new CheckSum()
      for (c <- s)
        acc.add(c.toByte)

      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }

}