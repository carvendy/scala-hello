package com.carvendy.hello.scala

import scala.collection.mutable.Set

object TestMutableSet {
    def main(args: Array[String]): Unit = {
      val muset = Set("haha","xixi")
      muset += "yoyo"
      println(muset)
    }
}