package com.Implicit_Test.implicit02

/**
 * Created by Administrator on 2017/4/20 0020.
 * 隐式转换
 * 特殊售票窗口（只接受特殊人群，比如学生、老人）
 * 类型不对会尝试进行隐式转换
 */
object Main {
  implicit def man2superman(man: Man) :Superman = new Superman(man.name)

  def main(args: Array[String]) {
    val bob = new Man("Bob")
    bob.emitLaser()
  }
}
