
/**
  * Created by Administrator on 05/06/2017.
  */
  import java.util
object Main {

  def main(args: Array[String]){
    /*Hello World
     Output “Hello World!” via the println() method*/
    println("Hello World 1")

    /* Assignment
    Store “Hello World!” in a variable and then output it.*/
    var msg: String = "Hello World 2"
    println(msg)

    /* Parameters
    Create a method that accepts a string as a parameter, and then outputs that string.*/
    def message(msg: String): Unit ={
      println(msg)
    }
    message("Hello World 3")

    // Return types
    // Create a method that returns a string, in this case “Hello World!”, which you then use to output.
    def message2(msg: String): String ={
      return msg
    }
    println(message2("Hello World 4"))

    // Type Inference
    // Create a method that does not signify a return type and outputs whatever is given to it, then
    // test it by passing it the follow different data types, Double, String, Integer, Boolean
    def message3(msg: String): Unit ={
//      var msg: Boolean = true
//      var msg: Double = 1.1
//      var msg: Int = 1
      var msg: String = "Hello world 5"
      println(msg)
    }
    message3(msg)

    // Create a method that accepts two parameters, one being a string and one being an integer.
    // You method should return the amount of characters from the end of the string that the integer specifies
    def message4(message: String, n: Int): String = message.substring(message.length - n)
    println(message4("Hello", 3))

    // Strings 2
    // Create a method that accepts 4 parameters, two being a String and two being a character,
    // your method will then join both strings together and then replace all occurrences of the
    // character provided with the second character provided.
    def message5(msg1: String, msg2: String, m1: Char, m2: Char): String = msg1.concat(msg2).replace(m1, m2)
    println(message5("Ha", "llo", 'a', 'e'))

    // Operators
    // Create a method that accepts two Integers as an input, then returns the sum of those integers.
    def message6(n1: Int, n2: Int): Int = n1 + n2 
    println(message6(2,3))

    //Conditionals
    // Modify your method from the previous task to accept another parameter, a Boolean. Your
    // method will now check if that Boolean is true, and if it is then it will return the sum of the
    // two numbers provided, if it is false it will return the multiplication of the two numbers instead.
    def message7(n1: Int, n2: Int, Question: Boolean): Int = {
      
      if(Question){
        n1 + n2
      }else{
        n1 * n2
      }
    } 
    println(message7(2, 3, false))

    // Conditionals 2
    // Modify your method from the previous task to have some more conditional statements to
    // check if one of the numbers is 0, which if this is true then you should return the other non-0 number.
    def message8(n1: Int, n2: Int, Question: Boolean): Int = {
      if(n1 == 0 && n2 == 0 ){
        0
      }else if(n1 == 0){
         n2
      }else if(n2 == 0){
        n1
      }
      else{
        message7(n1, n2, Question)
      }
    } 
    println(message8(0,0, true))  

    // Iteration
    // Create a method that accepts two parameters, a string and an integer. Your method should
    // print out the string provided as many times as the integer designates
    def message9(msg: String, n: Int): Unit = {
      for(i <- 1 to n){
        println(msg)
      }
    } 
    message9("Hello World", 3)

    // Iteration 2
    // Create a method that accepts two parameters, one a String and the other an integer, your
    // method will then output that string in a rectangle-like fashion as many times as the number dictates.
    def message10(msg: String, n: Int): Unit = {
      for(i <- 1 to n){
        println(msg * n)
      }
    } 
    message10("Hello World ", 3)

    // Iteration 3 - FizzBuzz
    // Create a method that accepts three parameters, two strings and one integer. Your method
    // will then loop from 1 to the integer provided, outputting the current iteration count every iteration.
    // However if the current iteration is divisible by 3, output the first String provided.
    // If the current iteration is divisible by 5, output the second String provided.
    // If it is divisible by both 3 and 5, then output the concatenation of the two Strings. Input-> (Fizz,Buzz,15)
    // Output-> 1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz

    def message11(msg1: String, msg2: String , n: Int): Unit = {
      for(i <- 1 to n){
        if(i % 3 == 0 && i % 5 == 0){
          println(msg1.concat(msg2))
        }else if(i % 3 == 0){
          println(msg1)
        }else if(i % 5 == 0){
          println(msg2)
        }else{
          println(i)
        }
      }
    } 
    message11("Fizz ", "Buzz", 15)

    // Iteration 4
    // Rewrite your previous three iteration exercises but using method recursion, no loops involved.

    def message9R(msg: String, n: Int, count: Int = 1): Unit = {
      println(msg)
      var x = count + 1
      if(count < n){
        message9R(msg, n, x)
      }
    }
    message9R("Hello World", 3)

    def message10R(msg: String, n: Int, count: Int = 1): Unit = {
      println(msg * n)
      var x = count + 1
      if(count < n){
        message10R(msg, n, x)
      }
    }
    message10R("Hello World ", 3)

      def message11R(msg1: String, msg2: String, n: Int, count: Int = 1): Unit = {
      var x = count + 1
      var newMsg = msg1.concat(msg2)
      if(count % 3 == 0 && count % 5 == 0){
        println(newMsg)
      }else if(count % 3 == 0){
        println(msg1)
      }else if(count % 5 == 0){
        println(msg2)
      }else{
        println(count)
      }
      if(count < n){
      message11R(msg1, msg2, n, x)
      }
      }
    message11R("Fizz ", "Buzz", 15, 3)

    // Pattern Matching 1
    // Rewrite your previous conditional exercises to use pattern matching.
    def patternMatch1(n1: Int, n2: Int, Question: Boolean): Any = Question match {
      case true => n1 + n2
      case _ => n1 * n2
    }
    println(patternMatch1(2, 3, true))


    def patternMatch2(n1: Int, n2: Int, q: Boolean): Any = (n1, n2, q) match{
      case (n1, n2, q) if n1 == 0 && n2 == 0 => "both " + 0
      case (n1,n2, q) if n1 == 0 => "n2: " + n2
      case (n1, n2, q) if n2 == 0 => "n1: " + n1
      case _ => "what?"
    }
    println(patternMatch2(1, 0, true))

    // ALTERNATIVE WAY BELOW
//    def patternMatch2(input:Any): Any = input match{
//      case (n1, n2, q) if n1 == 0 && n2 == 0 => "both " + 0
//      case (n1,n2, q) if n1 == 0 => "n2: " + n2
//      case (n1, n2, q) if n2 == 0 => "n1: " + n1
//      case _ => "what?"
//    }
//    println(patternMatch2(0, 0, true))


    // Pattern Matching 2
    // Create a method that takes a pair of integers and then returns the pair swapped around using pattern matching
    // Tuple2
def patternMatch3(n: Any): Any = n match{
  case (n1, n2) => (n1, n2).swap
  case List(n1, n2) => List(n2, n1)
  case Array(n1, n2) => Array(n2, n1)
  case first :: second :: _ => List(second, first)
  case _ => "Just switch the numbers"
}
println(patternMatch3(List(1,2,3,4)))

    /* Functional 1
    Using java.util.TimeZone.getAvailableIDs write a single line of code that returns a data set*/
      java.util.TimeZone.getAvailableIDs.filter(x1 => x1.contains("/")).map(x2 => x2.split('/') last).grouped(10).map(x3 => x3.head).toArray
  }// end of main method

}// end of main object
