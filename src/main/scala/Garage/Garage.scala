package Garage

import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 13/06/2017.
  */

class Garage {

  def main(args: Array[String]): Unit = {

    val vehicle = new ListBuffer[Vehicle]()

    def addVehicle(newVehicle: Vehicle) = {
      vehicle.append(newVehicle)
    }

    def removeVehicle(id: Int): Unit = {
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

    println(addVehicle(new Car(1, "bmw", "red", "1series", "xml168", 280.0)))

  }
}
