package task6

import scala.annotation.tailrec

/**
 * This case implement function
 * that takes a list of strings and returns
 * a new string consisting of all space-separated strings in the list.
 */
object SeparationOfStrings {
  def main(args: Array[String]): Unit = {
    val list = List("Мама", "мыла", "раму")

    val res1 = joinWithGapV1(list)
    val res2 = joinWithGapV2(list, new StringBuilder())
    println(s"Result of joining V1: ${res1}")
    println(s"Result of joining V2: ${res2}")
  }

  private def joinWithGapV1(list: List[String]): String = {
    list.mkString(" ")
  }

  @tailrec
  private def joinWithGapV2(list: List[String], resultLine: StringBuilder): String = list match {
    case head :: tail => joinWithGapV2(tail, resultLine.addAll(head + ' '))
    case _ => resultLine.substring(0, resultLine.length() - 1)
  }
}
