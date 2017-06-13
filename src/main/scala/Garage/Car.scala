package Garage

/**
  * Created by Administrator on 13/06/2017.
  */
case class Car(id: Int, brand: String, color: String, model: String, licensePlate: String, speed: Double) extends Vehicle{
  var vehicleType = VehicleType.CAR

  override def toString: String = s"brand is: $brand"
}
