package Garage
/**
  * Created by Administrator on 13/06/2017.
  */
case class Car(c_id: Int, c_isBroken: Boolean) extends Vehicle{
  val vehicleType = VehicleType.CAR
  val id = c_id
  val isBroken = c_isBroken
//  addParts()

  override def toString: String = s"car id is: $id, car vehicle type: $vehicleType"
}
