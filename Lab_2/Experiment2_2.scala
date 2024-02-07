package Lab_2

object Experiment2_2 {
    def main(args: Array[String]): Unit = {
        println("Please enter a number:")
        val number = scala.io.StdIn.readDouble()

        val result = if (number >= 0) {
            "positive"
        } else {
            "negative"
        }
        println(s"The number is $result.")
    }
}
