package task1

/**
 * This case describe the greeting of the inputted user
 */
object NameGreeting extends App {
  print("Input u name: ")
  val name = scala.io.StdIn.readLine()
  println(s"Greeting, ${name}!")
}
