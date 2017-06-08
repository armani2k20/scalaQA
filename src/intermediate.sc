// TOO HOT
val errMsg : String = "Stop! What are you doing?"
def tooHot(temprature: Int, isSummer: Boolean): Any = (temprature, isSummer) match {
  case (temprature, isSummer) if temprature >= 60 && temprature <= 90 && isSummer => false
  case (temprature, isSummer) if temprature >= 60 && temprature <= 90 && isSummer != true => true
  case (temprature, isSummer) if temprature >= 60 && temprature <= 100 && isSummer => true
  case (temprature, isSummer) if temprature >= 60 && temprature <= 100 && isSummer != true => false
  case _ => errMsg
}

println(tooHot(20,false))