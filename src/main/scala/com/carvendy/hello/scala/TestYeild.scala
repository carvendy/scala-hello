package com.carvendy.hello.scala

object TestYeild {

  def main(args: Array[String]): Unit = {
    println(mutilTable)
  }

  def makeRowSeq(row: Int) = {
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString()
      val padding = " " * (4 - prod.length())
      prod + padding
    }
  }
  
  def makeRow(row: Int) = makeRowSeq(row).mkString
  
  def mutilTable = {
    val tableSeq = 
      for (row <- 1 to 10)
        yield makeRowSeq(row)
      
    tableSeq.mkString("\n")
  }
}