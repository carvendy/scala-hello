package com.carvendy.hello.scala

object TestFor {
  
  def main(args: Array[String]): Unit = {
    val list= (new java.io.File(".")).listFiles();
    
    for(file<-list){
      println(file.getName)
    }
    
    for(i <- 1 until 4){
      println(i)
    }
    
    
    /**
     *  for(file<-list
           if file.isFile
           if file.getName.endsWith(".txt")
         )
     */
     for{file<-list
       if file.isFile
       if file.getName.endsWith(".txt")
     }{
      println(file.getName)
    }
     
     
     val newFile = for{file<-list
       if !file.getName.endsWith(".txt")
     } yield {
       file//返回
     }
     
     println(newFile.length)
  }
}