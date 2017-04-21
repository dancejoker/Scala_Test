package com.trait_test

/**
 * Created by Administrator on 2017/4/14 0014.
 */
trait Read {
  val name :String;
  def read() = {
    println("Your friend " + name + "is reading");
  }
}
