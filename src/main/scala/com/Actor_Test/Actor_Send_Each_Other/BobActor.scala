package com.Actor_Test.Actor_Send_Each_Other

import scala.actors.Actor

/**
 * Created by Administrator on 2017/4/20 0020.
 */
case class Message(content:String,sender:Actor)
class BobActor extends Actor{
    def act() = {
      while(true){
        receive{
          case Message(content,sender) => {
            println("Bob received :" + content); sender ! "I am bob,can i help you?"
          }
        }
      }
    }
}
