package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Bike(b_id: Int, b_parts: String) extends Vehicle {
  var vehicleType = VehicleType.BIKE
  var id: Int = b_id
  var parts: String = b_parts

  override def toString: String = s"id is: $id, parts: $parts "
}
