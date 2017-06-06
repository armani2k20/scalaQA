
// Tuple2
def patternMatch3(n1: Int, n2: Int): Any = (n1, n2) match{
  case (n1, n2) => (n1, n2).swap
}
println(patternMatch3(2, 1))



// List
def patternMatch4(n1: Int, n2: Int): Any = List(n1, n2) match{
  case List(n1, n2) => List(n1, n2).reverse
}
println(patternMatch4(2, 1))



// Array
val intArray = new Array[Int](2)
def patternMatch5(n1: Int, n2: Int): Any = intArray match{
  case Array(2,1) => Array(2,1).grouped(2).flatMap(_.reverse).toArray
}
println(patternMatch5(2, 1))





