package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Customer (cu_id: Int, cu_name: String) extends Person{
  var id: Int = cu_id
  var name: String = cu_name
  var personType: PersonType.Value = PersonType.CUSTOMER

  override def toString: String = s"id is: $id, name is: $name"
}
