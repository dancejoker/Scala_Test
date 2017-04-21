package com.wang

import java.util

/**
 * Created by Administrator on 2017/4/19 0019.
 */
class ArrayList_Test {
  var arr = new util.ArrayList[Any]
  arr.add(123)
  arr.add("question")
  println(arr)
  val it = arr.iterator()
  while(it.hasNext){
    println(it.next());
  }
}
