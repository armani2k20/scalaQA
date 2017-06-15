package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Bike(bikeId: Int) extends Vehicle {
  var id = bikeId
  var vehicleType = VehicleType.BIKE
  addParts()
  override def toString: String = s"id is: $id, vehicle type: $vehicleType, parts: $parts"
}
