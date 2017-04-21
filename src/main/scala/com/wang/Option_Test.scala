package com.wang

/**
 * Created by Administrator on 2017/4/12 0012.
 */
class Option_Test {
  /**
   * 标准类库中的Option类型用样例类来表示拿着可能存在，也可能不存在的值
   * 样例子类some包含了某个值，例如：Some("Fred")
   * 而样例对象None表示没有值
   * 这比使用空字符串的意图更加清晰，比使用null来表示缺少某值的做法更加安全
   * Map的Get方法返回的就是一个Option
   */
  val scores = Map("Alic" -> 100,"Jack"->200);
  scores.get("Alic") match {
    case Some(score) => println(score)
    case None => println("No Score")
  }
  val aliceScore = scores.get("Alic").get;
  println(f"allceScore value is : $aliceScore");
}
