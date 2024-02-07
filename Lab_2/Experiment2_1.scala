package Lab_2

object Experiment2_1 {
    def main(args: Array[String]): Unit = {
        println("please enter the first number:")
        val number1 = scala.io.StdIn.readDouble()
        println("please enter the second number:")
        val number2 = scala.io.StdIn.readDouble()

        val largestNumber = {
            if (number1 > number2) {
                number1
            } else {
                number2
            }
        }
        println(s"The largest number is: $largestNumber")
    }
}
