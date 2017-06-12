
import scala.math

  def prime(num: Int) = num > 1 && (2 to (math.sqrt(num) toInt)).forall(num % _ != 0);
1 to 3000000 filter prime foreach println