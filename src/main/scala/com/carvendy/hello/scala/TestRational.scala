package com.carvendy.hello.scala


class Rational(a:Int,b:Int){
  //println("create "+a+"/"+b)
  
  require(b !=0 )//先决条件
  
  val numer = a
  val denom = b//声明才可以访问
  
  def this(a:Int)= this(a,1)
  
  /**
   *  重写
   */
  override def toString = a +"/" + b
  
  def add(that:Rational): Rational = {
    
    println((a*that.denom + that.numer * b) + "/"+(b*that.denom))
    return null;
  }
  
}

object TestRational extends App {
  
  val one = new Rational(1,2)
 // val two = new Rational(1,0)// 抛异常
  println(one)
  
  val that = new Rational(1,4)
  one.add(that);
  
}