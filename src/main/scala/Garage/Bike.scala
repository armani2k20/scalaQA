package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Bike(id: Int, isBroken: Boolean ) extends Vehicle {
  var vehicleType = VehicleType.BIKE

  override def toString: String = s"id: $id, Vehicle type: $vehicleType, Broken: $isBroken"
}
