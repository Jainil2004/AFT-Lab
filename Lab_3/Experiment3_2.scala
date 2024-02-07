package Lab_3

object Experiment3_2 {
    def largest_num(num1: Int, num2: Int): Int = {
        if (num1 > num2) {
            return num1
        } else {
            return num2
        }
    }

    def main(args: Array[String]): Unit = {
        println("please enter the first number")
        var num1 = scala.io.StdIn.readInt()
        println("please enter the second number")
        var num2 = scala.io.StdIn.readInt()

        var result = largest_num(num1, num2)
        println(s"the largest num in $num1 and $num2 is $result")
    }
}
