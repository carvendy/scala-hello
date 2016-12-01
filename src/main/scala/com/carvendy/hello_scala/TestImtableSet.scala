package com.carvendy.hello_scala


object TestSet {
  def main(args: Array[String]): Unit = {
    var jetSet = Set("haha","ha123")//不可变集
    jetSet += "Lear"
    println(jetSet.contains("haha"))
  }
}