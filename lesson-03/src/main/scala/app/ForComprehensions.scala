package app

object ForComprehensions extends App {
  //1
  val listInRage = List.range(1, 10)
  //2
  val squares = for {
    el <- listInRage
  } yield {
    el * el
  }
  println("Squares: " + squares)
  //3
  val evenList = for {
    el <- listInRage
    if el % 2 == 0
  } yield {
    el
  }
  println("Even list: " + evenList)
}
