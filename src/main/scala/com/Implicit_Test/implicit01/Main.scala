package com.Implicit_Test.implicit01

/**
 * Created by Administrator on 2017/4/20 0020.
 * 隐式转换
 * 特殊售票窗口（只接受特殊人群，比如学生、老人）
 * 类型不对会尝试进行隐式转换
 */
object Main {

  implicit def object2SpecialPerson(obj:Object): SpecialPerson = {
    if(obj.getClass == classOf[Student]) { //如果obj是学生类
      val stu = obj.asInstanceOf[Student]  //将obj转换为学生类，返回的是学生类
      new SpecialPerson(stu.name)
    } else if (obj.getClass == classOf[Older]){
      val stu = obj.asInstanceOf[Older]
      new SpecialPerson(stu.name)
    }else{
      Nil
    }
  }

  var ticketNumber = 0;
  def buySpecialTicket(p:SpecialPerson):String = {
    ticketNumber += 1
    "T-"+ticketNumber
  }

  def main(args: Array[String]) {
    val changyy = new Student("changyy")
    println(buySpecialTicket(changyy))
    val gaga = new Older("gaga")
    println(buySpecialTicket(gaga))
    val Mr_Huang = new Teacher("Mr_Huang")
    println(buySpecialTicket(Mr_Huang))
  }
}
