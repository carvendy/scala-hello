package com.carvendy.hello.scala.fun

object LocalFun {
  
  def main(args: Array[String]): Unit = {
    a
    
    val fun1 = (x:Int) => x +1//(x需要定义类型)function
    println("num1-->"+fun1(2))
    
    val fun2 = (x:Int) =>{
      var num = x+1
      num = num * 2
      x + num//等价于return
      x + num + "abc"//没有定义返回类型
    }
    println("num2-->"+fun2(2))
    
    val fun3 = (x:String) => {
      x+"abc"
    }
    
    println("num3-->"+fun3)
    
    val list = List(1,2,4,5,6)
    list.foreach { x => print(x+",") }//不声明类型，是因为编译器知道类型
  }
  
  
  def a(){
    val numa = 1
    
    def b(){
      //作用域问题
      println(numa+"b")
    }
    
    println("a")
    b    
  }
  
}