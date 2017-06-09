  // gets data from file
  val data = scala.io.Source.fromFile("C:\\Users\\Administrator\\Desktop\\data.txt").getLines()

  // stores data in an Array
  val arrayData = data.toArray

  // converts all data to lowercase words
  val arrayDataLowerCase = arrayData.map(w => w.toLowerCase)

  // converts the words to anagrams
  val anagram = arrayDataLowerCase.map(w => w.sorted)

  // maps a value of type Int to each anagram
  val anagramMapped = anagram.groupBy(identity).mapValues(_.size)

  // finds the largest value _._1 == Key _._2 = Value
  val maxAnagram = anagramMapped.maxBy(_._2)

  anagramMapped.foreach{
    case(k, v) => println(s"key: $k, val: $v")
  }







