package Garage
/**
  * Created by Administrator on 15/06/2017.
  */
case class Parts(id: Int, cost: Double, isBroken: Boolean, damageLevel: Int) {

  override def toString: String = s"parts id: $id, cost: $cost, isBroken: $isBroken, damageLevel: $damageLevel"
}
