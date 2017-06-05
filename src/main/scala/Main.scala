

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








  }// end of main method

}// end of main object
