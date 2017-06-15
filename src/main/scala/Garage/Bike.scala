package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Bike(b_id: Int, b_isBroken: Boolean) extends Vehicle {
  val vehicleType = VehicleType.BIKE
  val id = b_id
  val isBroken = b_isBroken
//  addParts()

  override def toString: String = s"id: $b_id, Vehicle type: $vehicleType, Broken: $b_isBroken"
}
