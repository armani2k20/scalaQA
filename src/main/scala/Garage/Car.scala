package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Car(c_id: Int) extends Vehicle{
  var id: Int = c_id
  var vehicleType = VehicleType.CAR

  override def toString: String = s"id is: $id"
}
