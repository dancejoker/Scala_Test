package com.wang

/**
 * Created by Administrator on 2017/4/12 0012.
 */
class Scala_Test {
    //方法体
    val lazyVal = {println("helloworld");1};
    println(lazyVal);
    //加lazy等价于函数
    lazy val lazyVal1 = {println("are you sure?"); 2};
    println(f"lazy val start $lazyVal1");
    def fuction = {f"function equals to $lazyVal1"};
    println(fuction);
}
