package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
abstract class Person {
  var id: Int
  var name: String
  var personType: PersonType.Value

  override def toString: String = s"id is: $id, name is: $name"
}
r