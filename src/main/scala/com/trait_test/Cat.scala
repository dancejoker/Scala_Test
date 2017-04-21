package com.trait_test

/**
 * Created by Administrator on 2017/4/19 0019.
 */
//通过with给Cat加上Speak,Listen,Read特性
//trait就是实现了方法的接口
class Cat(override val name: String) extends Animal(name: String) with Speak with Listen with Read{
  override def toString(): String = "hello " + name + "!"
}
