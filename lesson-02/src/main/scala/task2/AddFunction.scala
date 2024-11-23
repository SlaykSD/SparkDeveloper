package task2

/**
 * This case describes the implementation of the add func
 */
object AddFunction {
  def main(args: Array[String]): Unit = {
    val a1 = 10;
    val a2 = 20;

    val sum = add(a1, a2)
    println(s"Sum ${a1} and ${a2} is ${sum}")
  }

  private def add (first: Int,second: Int ): Int = {
    first + second
  }
}
