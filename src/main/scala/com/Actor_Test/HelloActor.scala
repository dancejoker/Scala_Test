package com.Actor_Test

import scala.actors.Actor

/**
 * Created by Administrator on 2017/4/20 0020.
 */
class HelloActor extends Actor{
      def act() = {
        while(true){
          receive{
            case name:String=> println("Hello, " + name)
            case money:Int=> println("How much ? " + money)
          }
        }
      }
}
object HelloActor{
  def main(args: Array[String]) {
    val helloActor = new HelloActor
    helloActor.start()
    helloActor ! 100
  }
}
