package Garage

import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 13/06/2017.
  */

class Garage {

  val vehicles = new ListBuffer[Vehicle]()
  var employees = new ListBuffer[Employee]()
  val occEmployees = new ListBuffer[Employee]()
  val maxCost: Int = 500
  var isOpen: Boolean = false

  def addVehicle(newVehicle: Vehicle) = {
    vehicles += (newVehicle)
  }

  def removeVehicle(id: Int) = {
    vehicles -= (vehicles.filter(x => x.id == id).head)
  }

  def fixVehicle(vehicle: Vehicle, employee: Employee): Vehicle = {
    val start = System.currentTimeMillis()

    vehicle.parts = vehicle.parts.map(x => if (x.broken) {
      x.broken = false;
      x.damageLevel = 0.0;
      x
    } else x)

    val end = System.currentTimeMillis()
    val duration = end - start

    println("repair duration: " + duration, "employee: " + employee, "results: " + vehicle)

    vehicle

  }

  def manageGarage(): Unit = {
    if (isOpen) {
      vehicles.foreach(x => {
        occEmployees += employees.head
        employees = employees.tail
        fixVehicle(x, occEmployees.head)
        employees += occEmployees.head
        occEmployees -= occEmployees.head
      })
    } else {
      println("garage is closed")
    }
  }

  def registerEmployee(newEmployee: Employee): Unit = {
    employees.append(newEmployee)
  }

  def calculateBills(vehicle: Vehicle): Double = {
    vehicle.parts.filter(x => x.broken == true).map(x => x.damageLevel * maxCost).sum
  }

  def openGarage(): Unit = isOpen = true

  def closeGarage(): Unit = isOpen = false

  override def toString(): String = {
    f"amount of employees is ${employees.length} \nAmount of cars in garage is ${vehicles.length}, Total cost is: ${vehicles.map(x => calculateBills(x)).sum}%2.2f"
  }

}