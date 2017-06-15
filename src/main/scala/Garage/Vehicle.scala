package Garage

import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 13/06/2017.
  */
abstract class Vehicle {
  var id: Int
  var vehicleType: VehicleType.Value
  var parts: ListBuffer[Parts] = new ListBuffer[Parts]

  def addParts(): Unit ={
      var partsBroken = Array(true, true, true, false)
      for(i <- 1 to 10) parts += new Parts(i, partsBroken(i % partsBroken.length), Math.random())
  }

  def damageControl(vehicle: Vehicle): Unit ={
    vehicle.parts.foreach(x => if(!x.broken) x.damageLevel = 0)
  }
}
