package com.Actor_Test.Actor_Send_Class

import scala.actors.Actor

/**
 * Created by Administrator on 2017/4/20 0020.
 */
case class Register(username:String,password:String)
case class Login(username:String,password:String)
class UserManagerActor extends Actor {
  def act() = {
    while (true) {
      receive {
        case Login(username, password) => println("Login : " + username + " : " + password)
        case Register(username, password) => println("Register : " + username + " : " + password)
      }
    }
  }
}

object UserManagerActor{
  def main(args: Array[String]) {
    val userActor = new UserManagerActor
    userActor.start()
    //下面一行代码，意为向userActor这个对象发送一个类
    userActor ! Register("Answer","1111")
    userActor ! Login("Bob","123")
  }
}
