package task3


/**
 * This case is realize of increment values of the List
 * Validation of INPUT is <b>NOT</b> implemented
 */
object IncrementList {
  def main(args: Array[String]): Unit = {
    val inc = (x: Int) => x + 1

    var list = dialogList()
    list = list.map(inc)

    println("_____________RESULT LIST IS_______________")
    list.foreach(elem => print(s"${elem} "))
  }

  private def dialogList(): List[Int] = {
    val n = dialogInt("the size of List")
    Vector
      .from(for (i <- 1 to n)
        yield dialogInt("the value of list"))
      .toList
  }

  private def dialogInt(msg: String) = {
    print(s"Input a number that represents ${msg}: ")
    scala.io.StdIn.readInt();
  }
}
