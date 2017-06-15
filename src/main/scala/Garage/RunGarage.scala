package Garage

object RunGarage {
  def main(args: Array[String]): Unit = {
    val garage = new Garage()
    val car = Car(1, true)
    val employee = Employee(1, "name")
    garage.addVehicle(car)
    garage.registerEmployee(employee)
    garage.removeVehicle(car)
    println(garage)
    println(car)
    println(employee)
  }
}
