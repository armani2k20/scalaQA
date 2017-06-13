package Garage

/**
  * Created by Administrator on 13/06/2017.
  */
abstract class Vehicle {
  var id: Int
  var color: String
  var brand: String
  var model: String
  var licensePlate: String
  var speed: Double
  var vehicleType: VehicleType.Value
}
