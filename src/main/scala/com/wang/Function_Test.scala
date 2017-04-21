package com.wang

import javax.security.auth.callback.Callback

/**
 * Created by Administrator on 2017/4/13 0013.
 */
class Function_Test {
    //变量可以推断返回类型
    //简化版的函数格式如下：
    def max(x:Int,y:Int) = if(x > y ) x else y

    //带默认参数的函数
    def sayName(word:String="helloworld"):String = {
      println(word)
      word
    }
    //传入数组
    def sumMoreParameter(elem : Int*)={
      var sum = 0;
      for(e <- elem){
        println(e)
        sum += e
      }
      sum
    }


    def add(a:Int,b:Int) = a + b

    def add2 = add(_:Int,2)

    //f(n) = f(n) * f(n-1) ,递归阶乘
    def fac(n:Int):Int = if(n <= 0) 1 else n * fac(n-1)

    //函数柯里化
    def multiply(n:Int)(m:Int) = n + m

    def multiply2 = multiply(2)_


    //匿名函数声明方式 ，声明了一个函数对象赋给了t
    val t = () => 333   //等于 val t = () =>{333}
    // :后面是数据类型，c代表传进来的参数
    //也就是说testFunction传进来的是一个匿名函数 ，且这个匿名函数没有参数，返回的是Int
    // 这里需要注意，如果testFunction(c : ()=>Int)后面没有等号，意味着没有返回值
    def testFunction(c : ()=>Int) : Int = {
      //这里才调用了传进来的匿名函数
      println(c())
      1000
  }
    //带参数的匿名函数
    val sum = (a : Int) => a + 100;
    def testFunction2(callback : (Int,Int) => Int) = {
      println(callback(123,123))
    }
    //嵌套函数,
    def add3(x:Int,y:Int,z:Int):Int = {
      def add2(x:Int,y:Int):Int = {
        x + y;
      }
      add2(add2(x,y),z)
    }

  def sum2(f : Int => Int) : (Int ,Int) => Int = {
    def sumF(a : Int, b : Int) : Int =
      if(a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }
}
