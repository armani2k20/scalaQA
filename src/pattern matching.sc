
def patternMatch2(n1: Int, n2: Int, q: Boolean): Any = (n1, n2, q) match{
  case (n1, n2, q) if n1 == 0 && n2 == 0 => "both " + 0
  case (n1,n2, q) if n1 == 0 => "n2: " + n2
  case (n1, n2, q) if n2 == 0 => "n1: " + n1
  case _ => "what?"
}
println(patternMatch2(1, 0, true))


