package com.wang

/**
 * Created by Administrator on 2017/4/12 0012.
 */



object Scala {
  def main(args: Array[String]): Unit = {
  //  new Option_Test()



   val word = new Function_Test()
    word.sayName()

    var sum = word.sumMoreParameter(1,2,3,4)
    println(f"sum is $sum")

    println(word.add2(3))

    val result = word.fac(5)
    println(f"5的阶乘是$result")

    sum = word.multiply(123)(123)
    println(f"调用柯里化相加函数 ：$sum")
    sum = word.multiply2(123)
    println(f"调用柯里化相加函数 ：$sum")

    //调用匿名函数
     println(word.t())
     println(word.testFunction(word.t))
     //传入的是一个匿名函数
     word.testFunction2((a:Int,b:Int) => {println(a * b);a*b})
     //调入word.add这个函数
     word.testFunction2(word.add)

    //调用嵌套函数
    println(word.add3(1,2,3))

    def sumF = word.sum2((x) => x)
    println(sumF(1,2));


    val syntax = new Syntax_Test()
    //syntax.test()
    //syntax.test2()
    //syntax.test3()
     println(syntax.testMatch(2))
      new Collection_Test();

   new ArrayList_Test().arr;
  }
}
