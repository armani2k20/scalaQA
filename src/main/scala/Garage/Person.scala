package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
abstract class Person {
  var id: Int
  var age: Int
  var name: String
  var personType: PersonType.Value

  override def toString: String = s"id is: $id, age is: $age, name is: $name"
}
