package app

import domain.Person

import scala.util.Random

object Task_From1To5 extends App {
  //1
  val age = 10
  val weight = 35.3
  val name = "Evgeniy Sidorov"
  val isStudent = true

  //let be a class
  val person = Person(age, weight, name, isStudent)

  //2 print all values
  println(person)
  println("Json: " + person.toJsonString)

  //3
  val sum = (x: Int, y: Int) => x + y
  val x = 21
  val y = 10

  //3.1
  println(s"Let's sum x=${x} and y=${y}. Result is ${sum(x, y)}")

  //4
  val isOld = (age: Int) => if (age < 30) "Молодой" else "Взрослый"

  //4.1
  println(s"Person ${person.name} is ${isOld(person.age)}")

  //5
  for (i <- 1 to 10) {
    println(s"${i} ")
  }

  //5.1
  val names = Vector("Sasha", "Masha", "Grisha")
  val rand = Random
  println("_____________Random Names______________")
  for (_ <- 1 to 10) {
    val name = names.lift(rand.nextInt(3)).get //random name
    println(s"${name}")
  }

}