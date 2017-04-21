package com.Actor_Test.Actor_Send_Each_Other

import scala.actors.Actor

/**
 * Created by Administrator on 2017/4/20 0020.
 */
class GagaActor(val bobActor: BobActor)extends Actor{
  def act()={
    bobActor ! Message("hello bob,I am gaga,are you free now ?",this)
    while(true){
      receive{
        case responce:String => println("gaga received : " + responce)
      }
    }
  }
}
