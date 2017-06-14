package Garage

import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 13/06/2017.
  */

class Garage {
  val vehicle = new ListBuffer[String]()

  def addVehicle(id: Int, color: String, brand: String, model: String, licensePlate: String, vehicleType: VehicleType.Value): Unit = {

    vehicle += (id, color, brand, model, licensePlate, vehicleType)

  }

  def removeVehicle(id: Int): Unit = {
    vehicle -= ("1", "audi", "tt", "se321rv", "CAR")
  }

  def fixVehicle(id: Int, color: String, brand: String, model: String, licensePlate: String): Unit = {

  }

  def registerEmployee(id: Int, name: String, age: String, personType: PersonType.Value): Unit = {

  }

  def calculateBills(id: Int, color: String, brand: String, model: String, licensePlate: String): Unit = {

  }

  def garageOutput(id: Int, color: String, brand: String, model: String, licensePlate: String): Unit = {

  }

  def openGarage(): Unit = {

  }

  def closeGarage(): Unit = {

  }

  println()


}
