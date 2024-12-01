package task5

/**
 * A program that takes a string and outputs its length
 */
object GetLength extends App {
  print("Input line for count length: ")
  val name = scala.io.StdIn.readLine()
  println(s"The length of line is ${name.length}")
}
