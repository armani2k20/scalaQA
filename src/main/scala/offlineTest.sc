// ***NOTE***: I HAVEN'T HAD A PROPER LOOK AT RECURSION YET

// Task 1
// Given a string, return a string where for every char in the original, there are two chars.

def doubleChar(a: String): String = {
    a.replace(a,a+a)

  // I need to target the first occurrence of each character and += that character only once
}

println(doubleChar("The"))

// Task 2
// Given a string, return a string where for every char in the original, there are two chars.
def getSandwich(a: String, b: String, c: String) = {
  a.concat(b).concat(c)

  if(a == "bread" && b =="bread"){
    println(c)
  }
  else if(b == "bread" && c == "bread"){
    println(a)
  }
  else if(c == "bread" && a == "bread"){
    println(b)
  }
  else{
    println(" ")
  }

}

println(getSandwich("bread", "toast", "bread"))

// Task 3
// Given three ints, a b c, one of them is small, one is medium and one is large.
// Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

def evenlySpaced(a: Int, b: Int, c: Int) = (a,b,c) match {
  case (a,b,c) if a - b == c | c - a == b | b - c == a => true
  case (a,b,c) if a + b == c | c + a == b | b + c == a => true
  case (a,b,c) if a * b == c | c * a == b | b * c == a => true
  case (a,b,c) if a / b == c | c / a == b | b / c == a => true
  case _ => false
}

println(evenlySpaced(4,6,2))


// Task 4
// ***NOTE***: I HAVEN'T HAD A PROPER LOOK AT RECURSION YET, DON'T FULLY UNDERSTAND IT


// Task 5
// ***NOTE***: I HAVEN'T HAD A PROPER LOOK AT RECURSION YET, DON'T FULLY UNDERSTAND IT
def bunnyEars(bunnies: Int) = {
  bunnies * 2
}

println(bunnyEars(6))


// Task 6
// Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

def nTwice(a: String, n: Int) = a.substring(0,n) + a.substring(a.length - n)
println(nTwice("Chocolate", 3))

// Task 7
// Given a string, return true if it ends in "ly".

def endsLy(a: String) = a match {
  case a if a.endsWith("ly") => true
  case _ => false

}
println(endsLy("awkwardly"))

// Task 8
// Given a string, return recursively a "cleaned" string where adjacent chars that are the same
// have been reduced to a single char. So "yyzzza" yields "yza".

def stringClean(a: String) = {
  // ***NOTE***: I HAVEN'T HAD A PROPER LOOK AT RECURSION YET, DON'T FULLY UNDERSTAND IT
}


