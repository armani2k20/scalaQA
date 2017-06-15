package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Customer (id: Int, name: String) extends Person{
  var personType: PersonType.Value = PersonType.CUSTOMER

  override def toString: String = s"customer id is: $id, customer name is: $name"
}
