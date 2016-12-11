package com.carvendy.hello.scala

object TestControlStruct {
  
  def main(args: Array[String]): Unit = {
    
    val filename = 
      if(args.length >1){
        args(0)
      }else{
        "default.txt"
      }
    
    println(filename)
    
    /**
     * switch
     */
    val num = 1;
   
    var matchReturn = {
      num  match {
        case 1 =>  "1" //println("match:"+num)
        case _ =>  "0"//println("match:")
      }
    }
    println("matchReturn"+matchReturn)
    
    
    val list =  List(99,69,56,70)
    var i = 0
    var flag = true
    while(i < list.length && flag){
      if(list(i) > 80){//continue
        println(list(i))
        
        if(list(i) >90){
          flag = false
        }
      } 
      
      i = i + 1
    }
  }
}