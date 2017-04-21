package com.trait_test

/**
 * Created by Administrator on 2017/4/14 0014.
 */
trait Listen {
  val name:String;
  def listen() = {
    println( "Your friend " + name + " is listening");
  }

}
