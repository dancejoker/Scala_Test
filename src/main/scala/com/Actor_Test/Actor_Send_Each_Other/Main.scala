package com.Actor_Test.Actor_Send_Each_Other

/**
 * Created by Administrator on 2017/4/20 0020.
 */
object Main {
  def main(args: Array[String]) {
    val bobActor = new BobActor
    val gagaActor = new GagaActor(bobActor)
    bobActor.start()
    gagaActor.start()
  }
}
