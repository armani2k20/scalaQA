package Garage

import scala.collection.mutable.ListBuffer
/**
  * Created by Administrator on 13/06/2017.
  */
abstract class Vehicle {
  var id: Int
  var vehicleType: VehicleType.Value
  var isBroken: Boolean
  var parts: ListBuffer[Parts]

  def addPart(): Unit ={
    parts += new Parts(1, 1.2, true, 5)
  }
}// end of vehicle class
