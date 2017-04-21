package com.Implicit_Test.implicit04

/**
 * Created by Administrator on 2017/4/21 0021.
 */
object Main {
    def signForExam(name:String)(implicit signPen: SignPen): Unit ={
        signPen.write(name + " arrive in time")
    }
    def main(args: Array[String]){
      import ImplicitContext._
      signForExam("Bob")
      signForExam("Jackson")
    }
}
