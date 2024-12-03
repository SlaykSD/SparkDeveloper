package imlicits

import domain.Person
import play.api.libs.json.{JsBoolean, JsNumber, JsObject, JsString, Writes}

object Util {
    implicit  val personWrites: Writes[Person] = {
      (o: Person) => {
        JsObject(Seq(
          "name" -> JsString(o.name),
          "age" -> JsNumber(o.age),
          "weight" -> JsNumber(o.weight),
          "student_flag" -> JsBoolean(o.isStudent)
        ))
      }
    }
}
