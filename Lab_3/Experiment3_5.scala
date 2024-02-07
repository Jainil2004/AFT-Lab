package Lab_3

object Experiment3_5 {
    def main(args: Array[String]): Unit = {
        val addition = (_: Int) + (_: Int)
        val subtraction = (_: Int) - (_: Int)
        val multiplication = (_: Int) * (_: Int)

        println(addition(10, 10))
        println(subtraction(10, 10))
        println(multiplication(10,10))
    }
}
