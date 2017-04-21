package com.Implicit_Test.implicit03

import com.Implicit_Test.implicit01.{Older, Student, SpecialPerson}

/**
 * Created by Administrator on 2017/4/21 0021.
 * 类型方法有但是参数不一致会尝试调用隐式转换
 */
object Main {
    implicit def obj2SpecialPersion(obj:Object): SpecialPerson = {
      if(obj.getClass == classOf[Student]){
        val student = obj.asInstanceOf[Student]
        new SpecialPerson(student.name)
      }else if(obj.getClass == classOf[Older]){
        val older = obj.asInstanceOf[Older]
        new SpecialPerson(older.name)
      }else{
        Nil
      }
    }
    def main(args: Array[String]){
      val ticketHouse = new TicketHouse
      val Bob = new Student("bob")
      println(ticketHouse.buySpecialTicket(Bob))
    }
}
