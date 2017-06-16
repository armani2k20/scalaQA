package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Employee (id: Int, name: String, personType: PersonType.Value = PersonType.EMPLOYEE) extends Person{
  override def toString: String = s"employee id is: $id, employee name is: $name"
}
