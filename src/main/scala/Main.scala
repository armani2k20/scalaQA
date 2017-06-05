

/**
  * Created by Administrator on 05/06/2017.
  */
object Main {

  def main(args: Array[String]){
    // Hello World
    // Output “Hello World!” via the println() method
    println("Hello World 1")

    // Assignment
    // Store “Hello World!” in a variable and then output it.
    var msg: String = "Hello World 2"
    println(msg)

    // Parameters
    // Create a method that accepts a string as a parameter, and then outputs that string.
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
    def message4(message: String, n: Int): String ={
      message.drop(n)
    }
    println(message4("Hello", 2))

    // Strings 2
    // Create a method that accepts 4 parameters, two being a String and two being a character,
    // your method will then join both strings together and then replace all occurrences of the
    // character provided with the second character provided.
    def message5(msg1: String, msg2: String, m1: Char, m2: Char): String ={
     var newMsg = msg1.concat(msg2)
      newMsg.count(_ == 'a')
    }
    println( message5("Ha", "llo", 'a', 'e'))






  }// end of main method

}// end of main object
