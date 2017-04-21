package com.wang

/**
 * Created by Administrator on 2017/4/13 0013.
 */
class Syntax_Test {
    def test(): Unit ={
      //1之所以可以调用to，原因是对1进行了隐式转换,也就是说1从Int类型转化为RichInt
      for(i <- 1.to(100))
        println(i)
      //to指定的范围是1到100（包括100）
      for(i <- 1 to 100)
        println(i)
    }
    def test2() ={
      //until的范围是1到100（不包括100）
      for(i <- 1 until 100)
        println(i)
    }
    def test3(): Unit ={
      //可以在for循环中加入if条件来限制输入
      for(i <- 0 to 100 if(i % 3) == 2; if(i % 5) > 3){
        println("I :" + i);
      }
    }
    // switch
    def testMatch(n : Int) = {
      n match {
        case 1 => {println("111");n;}
        case 2 => {println("222"); n;}
        case _ => {println("other"); "test";} //default
      }
    }
}
