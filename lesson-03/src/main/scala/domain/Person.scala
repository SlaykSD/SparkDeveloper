package domain

import imlicits.Util
import play.api.libs.json._

case class Person(age: Int, weight: Double, name: String, isStudent: Boolean) {
  implicit val personFormat: Writes[Person] = Util.personWrites;

  override def toString: String = {
    s"Person:[name = ${name}; age = ${age}; weight = ${weight}; is student = ${isStudent}]"
  }

  def toJsonString: String = {
    Json.toJson(this).toString()
  }
}

object Person {
  def dialogPerson(): Person = {
    val name = dialogName()
    val age = dialogAge()
    val weight = dialogWeight()
    val isStudent = dialogStudent()
    Person(age,weight, name, isStudent)
  }

  //TODO: Как это можно затемплейтить(зашаблонить)? Дженерики, все дела?
  private def dialogAge(): Int = {
    print(s"Input a age: ")
    scala.io.StdIn.readInt()
  }

  private def dialogName() = {
    print(s"Input a name: ")
    scala.io.StdIn.readLine()
  }

  private def dialogWeight() = {
    print(s"Input a weight: ")
    scala.io.StdIn.readDouble()
  }

  private def dialogStudent(): Boolean = {
    print(s"Input is student? (y/n): ")
    val rs = scala.io.StdIn.readChar()
    rs == 'y'
  }

}
