package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
abstract class Person {
  val id: Int
  val name: String
  val personType: PersonType.Value

  override def toString: String = s"id is: $id, name is: $name"
}