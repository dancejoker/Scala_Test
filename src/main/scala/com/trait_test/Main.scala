package com.trait_test
/**
 * Created by Administrator on 2017/4/19 0019.
 */
object Main {
  def main(args: Array[String]) {
    val h1 = new Human("answer")
    h1.Listen()

    val cat = new Cat("hello kitty")
    cat.listen();
    cat.speak();
    println(cat)
  }
}
