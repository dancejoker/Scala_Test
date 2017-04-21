package com.zhang

/**
 * Created by Administrator on 2017/4/14 0014.
 */
object Main {
  def main(args: Array[String]) {
    val p1 = new Point(123);
    println(p1.isOrginal);
    println("static number is : " + Point.sum());
    val p2 = new Point(222,333);
    println("static number is : " + Point.sum());
  }
}
