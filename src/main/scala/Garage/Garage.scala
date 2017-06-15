package Garage

import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 13/06/2017.
  */

class Garage {

  val vehicles = new ListBuffer[Vehicle]()
  val employees = new ListBuffer[Person]()
  val maxCost: Int = 500

  def addVehicle(newVehicle: Vehicle) = {
    vehicles += (newVehicle)
  }

  def removeVehicle(id: Int) = {
    vehicles -= (vehicles.filter(x => x.id == id).head)
  }

  def fixVehicle(): Unit = {

  }

  def registerEmployee(newEmployee: Person): Unit = {
    employees.append(newEmployee)
  }

  def calculateBills(vehicle: Vehicle): Unit = {
    vehicle.parts.filter(x => x.broken == true).map(x => x.damageLevel * maxCost).sum
  }

  def garageOutput(): Unit = {

  }

  def openGarage(): Unit = {

  }

  def closeGarage(): Unit = {

  }

  override def toString(): String={
    s"amount of employees is ${employees.length} \nAmount of cars in garage is ${vehicles.length}\n$vehicles\n$employees"
  }

}