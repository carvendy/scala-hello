package com.carvendy.hello.scala

object TestList {
  def main(args: Array[String]): Unit = {
    val list12 = List(1,2)
    val list34 = List(3,4)
    val list1234 = list12 ::: list34;
    println(list12+"--"+list34);
    println(list1234);
  }
}