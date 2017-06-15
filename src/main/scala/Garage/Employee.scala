package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Employee (id: Int, name: String) extends Person{
  var personType: PersonType.Value = PersonType.EMPLOYEE

  override def toString: String = s"employee id is: $id, employee name is: $name"
}
