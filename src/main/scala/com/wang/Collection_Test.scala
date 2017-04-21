package com.wang

/**
 * Created by Administrator on 2017/4/13 0013.
 */
//important
class Collection_Test {
    var t = List(1,2,3,5,5);
    println("----0001----" + t(2));

    //map函数
    println(t.map(a => {print("***" + a); a + 2} ))
    println(t.map(_ + 1));
    //添加元素
    var t2 = t.+:("test")
    println(t2);
    println(6 :: t2)   //t2和6拼接起来输出，t2并没有变
    println(t2::6::Nil)  //拼接

    t2.foreach(t => print("-----+++++" + t))  //和map功能相似，不同点在于，map需要返回数据，foreach不会返回
    println("distinct 用于去重" + t.distinct)  //distinct 用于去重
    println("+++++" + t.slice(0,2));  //用于剪切，0到2表示第0,1个元素，不包括第三个元素
    for(i <- 0 to t2.length-1){
      println(i);
      println(t2(i));
    }

    println(t./:(0)({  //./用于累积操作,以第一个参数为初始值
      (sum,num) => print(sum + "--" + num + "  ");
        sum + num;
    }));

    //reduce函数
    println(t.reduce((x,y) =>{println("last result :" + x + "   now data is:" + y);x + y}));
    //x是上次算出的结果，本次要输入的元素。
    println(t.reduce(_ + _));

    //下标从tuple0从1开始，而不是从0开始
    var  tuple0 = (1,5,6,6);
    println(tuple0._1);
    println(tuple0._2);

    //map集合
    def Map_Test(): Unit ={
        var m1 = Map[String,Int]("a" -> 1,"b" -> 2)
        m1 += ("c" -> 3)
        println(m1)
        m1.foreach(a =>{
            println(a + " " + a._1 + " " + a._2);
        })
    }
}

