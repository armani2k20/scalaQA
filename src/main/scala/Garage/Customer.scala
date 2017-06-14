package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
class Customer (cu_id: Int, cu_name: String, cu_age: Int) extends Person{
  var id: Int = cu_id
  var age: Int = cu_age
  var name: String = cu_name

  override def toString: String = s"name is: $name"
}
