package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
class Employee (e_id: Int, e_name: String, e_age: Int) extends Person{
  var id: Int = e_id
  var age: Int = e_age
  var name: String = e_name

  override def toString: String = s"name is: $name"
}
