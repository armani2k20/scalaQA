package Garage

/**
  * Created by Administrator on 13/06/2017.
  */
case class Customer (id: Int, name: String, age: Int) extends Person{
  val personType = PersonType.CUSTOMER

  override def toString: String = s"name is: $name"
}
