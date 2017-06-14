package Garage

/**
  * Created by Administrator on 13/06/2017.
  */
case class Employee (id: Int, name: String, age: Int) extends Person{
  val personType = PersonType.EMPLOYEE

  override def toString: String = s"name is: $name"
}
