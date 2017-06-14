package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
class Bike(b_id: Int, b_brand: String, b_color: String, b_model: String, b_licensePlate: String, b_speed: Double) extends Vehicle {
  var vehicleType = VehicleType.BIKE
  var id: Int = b_id
  var brand: String = b_brand
  var color: String = b_color
  var model: String = b_model
  var licensePlate: String = b_licensePlate
  var speed: Double = b_speed

  override def toString: String = s"brand is: $brand"
}
