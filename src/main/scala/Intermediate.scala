
/**
  * Created by Administrator on 05/06/2017.
  */
object Intermediate {

  def main(args: Array[String]){
    val errMsg : String = "Stop! What are you doing?"

    /**
      * Blackjack
      * Given 2 integer values greater than 0, return whichever value is closest to 21 without going over 21.
      * If they both go over 21 then return 0
      */
    def blackjack(x: Int, y: Int): Any = (x,y) match {
      case (x, y) if x > 21 | y > 21 => 0
      case (x, y) if x <= 21 && y > x => y
      case (x, y) if x <= 21 && y < x => x
      case _ => errMsg
    }
    println(blackjack(22,22))

    /** 
      * Unique Sum
      * Given 3 integer values, return their sum. If one value is the same as another value, they do
      * not count towards the sum. Aka only return the sum of unique numbers given.
      */
    def uniqueSum(x: Int, y: Int, z: Int): Any = (x,y,z) match {
      case (x,y,z) if x != y && x != z && y != z =>  x + y + z
      case (x,y,z) if y != x && y != z && z != x=> x + y + z
      case (x,y,z) if z != y && z != x && x != y=> x + y + z
      case _ => errMsg
    }
    println(uniqueSum(1,23,23))

    /**
      * Too hot?
      * Given an integer value and a Boolean value, temperature and isSummer, if temperature is
      * between 60 and 90 (inclusive), unless its summer where the upper limit is 100 instead of 90.
      * Return true if the temperature falls within the range, false otherwise.
      */
    def tooHot(temprature: Int, isSummer: Boolean): Any = (temprature, isSummer) match {
      case (temprature, isSummer) if temprature >= 60 && temprature <= 90 && isSummer => false
      case (temprature, isSummer) if temprature >= 60 && temprature <= 90 && isSummer != true => true
      case (temprature, isSummer) if temprature >= 60 && temprature <= 100 && isSummer => true
      case (temprature, isSummer) if temprature >= 60 && temprature <= 100 && isSummer != true => false
      case _ => "Temprature too low"
    }
    println(tooHot(20,false))



  }// end of main method

}// end of main object
