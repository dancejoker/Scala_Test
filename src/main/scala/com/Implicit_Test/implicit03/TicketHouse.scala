package com.Implicit_Test.implicit03

import com.Implicit_Test.implicit01.SpecialPerson

/**
 * Created by Administrator on 2017/4/20 0020.
 * 类型方法有但是参数不一致会尝试调用隐式转换
 */
class TicketHouse {
    var ticketNumber = 0
    def buySpecialTicket(p:SpecialPerson)={
        ticketNumber += 1
        "T-" + ticketNumber
    }

}
