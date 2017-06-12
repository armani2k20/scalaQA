/**
  * Created by Administrator on 12/06/2017.
  */
import scala.math

object Prime {

  def main(args: Array[String]): Unit = {

    def prime(num: Int) =
      num > 1 &&
        (2 to (math.sqrt(num) toInt)).forall(num % _ != 0)

    def display(): Any = {
      1 to 3000000 filter prime foreach println
    }
    display()
  }
}
