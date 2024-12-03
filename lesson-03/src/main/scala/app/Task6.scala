package app

import domain.Person

object Task6{
  def main(args: Array[String]):Unit = {
    val person = Person.dialogPerson()
    val isOld = (age: Int) => if (age < 30) "Молодой" else "Взрослый"
    println(s"${person} Category is ${isOld(person.age)}")
    println("Just in case with json: " + person.toJsonString)
  }

}
