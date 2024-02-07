package Lab_3

object Experiment3_4 {
    def main(args: Array[String]): Unit = {
        val addition = (x: Int, y: Int) => x + y
        val subtraction = (x: Int, y: Int) => x - y
        val multiplication = (x: Int, y: Int) => x * y

        println("please enter the first number")
        val num1 = scala.io.StdIn.readInt()
        println("please enter the second number")
        val num2 = scala.io.StdIn.readInt()

        println(s"sum = " + addition(num1, num2))
        println(s"difference = " + subtraction(num1, num2))
        println(s"multiplication = " + multiplication(num1, num2))
    }
}
