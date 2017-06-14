package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
class Car(c_id: Int, c_brand: String, c_color: String, c_model: String, c_licensePlate: String, c_speed: Double) extends Vehicle{
  var vehicleType = VehicleType.CAR
  var id: Int = c_id
  var brand: String = c_brand
  var color: String = c_color
  var model: String = c_model
  var licensePlate: String = c_licensePlate
  var speed: Double = c_speed

  override def toString: String = s"brand is: $brand"
}
