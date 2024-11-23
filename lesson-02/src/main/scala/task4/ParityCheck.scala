package task4

/**
 * This case checks the number for parity
 */
object ParityCheck extends App{
  private val isParity = (x: Int) => (x % 2) == 0
  private val number = dialogInt()

  println(s"The number ${number} is ${if(isParity(number)) "even" else "odd"}")
  private def dialogInt() = {
    print(s"Input a number (Int): ")
    scala.io.StdIn.readInt();
  }
}
