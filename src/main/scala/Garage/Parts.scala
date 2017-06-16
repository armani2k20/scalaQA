package Garage

case class Parts(id: Int, var broken: Boolean, var damageLevel: Double ) {
  override def toString(): String = f"parts id: $id, is the part broken?: $broken, damage level: $damageLevel%2.1f"
}
