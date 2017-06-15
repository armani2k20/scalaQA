package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Car(carId: Int) extends Vehicle{
  var id = carId
  var vehicleType = VehicleType.CAR
  addParts()
  override def toString: String = s"id is: $id, vehicle type: $vehicleType, parts: $parts"
}
