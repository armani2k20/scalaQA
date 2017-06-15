package Garage

import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 13/06/2017.
  */

class Garage {

  val vehicles = new ListBuffer[Vehicle]()
  val employees = new ListBuffer[Person]()

  def addVehicle(newVehicle: Vehicle) = {
    vehicles += (newVehicle)
  }

  def removeVehicle(newVehicle: Vehicle) = {
    vehicles -= (newVehicle)
  }

  def fixVehicle(): Unit = {
  }

  def registerEmployee(newEmployee: Person): Unit = {
    employees.append(newEmployee)
  }

  def calculateBills(): Unit = {

  }

  def garageOutput(): Unit = {

  }

  def openGarage(): Unit = {

  }

  def closeGarage(): Unit = {

  }

  override def toString(): String={
    s"amount of employees is ${employees.length} \nAmount of cars in garage is ${vehicles.length}"
  }

}