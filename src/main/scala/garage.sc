import Garage.{PersonType, VehicleType}

import scala.collection.mutable.ListBuffer

class Garage {
  val vehicle = new ListBuffer[String]()

  def addVehicle(id: Int, color: String, brand: String, model: String, licensePlate: String, vehicleType: VehicleType.Value): Unit = {


    vehicle += ("1", "audi", "tt", "se321rv", "CAR")

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


}
