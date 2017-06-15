package Garage

object RunGarage {
  def main(args: Array[String]): Unit = {
    val garage = new Garage()
    val car = Car(1)
    val employee = Employee(1, "name")

    // add vehicles to garage
    for(i<- 1 to 20) garage.addVehicle(new Car(i))

    // register employee
    val names = Array("Paul", "Peter", "John", "Isaac", "Gandalf")
    for(i <- 0 until 5) garage.registerEmployee(new Employee( i+1 , names(i)))

    // remove vehicle
    garage.removeVehicle(3)

    // calculate bill
    garage.calculateBills(car)

    println(garage)
    println(car)
    println(employee)
  }
}
