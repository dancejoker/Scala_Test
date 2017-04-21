package com.zhang

/**
 * Created by Administrator on 2017/4/14 0014.
 */
//Point后面的参数表示默认的构造器
class Point(val x:Int,val y:Int) {
  var t = x
  var t1 = y;
  val isOrginal:Boolean = {
    x == 0 && y == 0
  }
  //构造器
  def this(xArg : Int){
    //必须调用默认构造器
    this(xArg,1234)
    println("hello I am constructor");
  }
}
//Scala语言中没有static成员存在，第二，Scala允许以某种方式去使用static成员
//这就是伴生机制，它把static成员和非static成员用不同的表达式，class为非static，object为static,
//但双方具有相同的package和name,最终编译器会把他们编译到一起。
object Point {
  var count = 0;
  def sum(): Int ={
    count += 1
    count;
  }
}
