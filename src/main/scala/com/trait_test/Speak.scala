package com.trait_test

/**
 * Created by Administrator on 2017/4/14 0014.
 */
trait Speak {
  val name :String;
  def speak() = {
    println("Your friends " + name + "is speaking");
  }

}
