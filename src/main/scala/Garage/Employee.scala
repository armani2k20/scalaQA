package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Employee (e_id: Int, e_name: String) extends Person{
  var id: Int = e_id
  var name: String = e_name
  var personType: PersonType.Value = PersonType.EMPLOYEE

  override def toString: String = s"id is: $id, name is: $name"
}
