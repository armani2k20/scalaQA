/**
  * Created by Administrator on 08/06/2017.
  */
object Advanced {
  def main(args: Array[String]): Unit = {

    // TODO: HashMaps – Anagrams
    def anagramGenerator(): Any = {
      // gets data from file, stores it in an array, converts word to lowercase
      val data = scala.io.Source.fromFile("C:\\Users\\Administrator\\Desktop\\data.txt").getLines().toArray.map(w => w.toLowerCase)

      // converts the words to anagrams, maps an Int value to each anagram,
      val anagram = data.map(w => w.sorted).groupBy(w => w).mapValues(_.length)
      println("anagram list: " + anagram)

      // filters the anagram map, returns the words with the most anagrams
      val anagramFiltered = anagram.filter(x => x._2 == anagram.maxBy(_._2)._2)
      println("filtered anagrams: " + anagramFiltered)

      // finds the largest value _._1 == Key _._2 = Value, filters by 'key' length, returns the longest word to anagram
      val maxAnagram = anagramFiltered.filter(x => x._1.length == anagramFiltered.maxBy(_._1.length)._1.length)
      println("largest anagram & word: " + maxAnagram)
    }
    println(anagramGenerator())

    // TODO: Prime Numbers 1
    def primeNumbers(): Any ={

    }


  }

}
