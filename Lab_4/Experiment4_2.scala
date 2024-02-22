package Lab_4

object Experiment4_2 {
//    code written by Jainil Jain
//    scala program to implement an arithmetic calculator using higher order functions

    def adder(num1: Int, num2: Int) = {
        println("sum is "+ (num1 + num2))
    }
    def subtractor(num1: Int, num2: Int) = {
        println("difference is "+ (num1 - num2))
    }
    def divider(num1: Int, num2: Int): Unit = {
        println("quotient is "+ (num1 / num2))
    }
    def multiplier(num1: Int, num2: Int): Unit = {
        println("multiplication is " + (num1 * num2))
    }
    def calculator(operation: Int, num1: Int, num2: Int): Unit = {
        operation match {
            case 1 => adder(num1, num2)
            case 2 => subtractor(num1, num2)
            case 3 => multiplier(num1, num2)
            case 4 => divider(num1, num2)
            case _ => null
        }
    }

    def main(args: Array[String]): Unit = {
        println("enter a operation:\n1. add\n2. subtract\n3. multiply\n4. divide")
        var operation = scala.io.StdIn.readInt()
        var num1 = scala.io.StdIn.readInt()
        var num2 = scala.io.StdIn.readInt()
        calculator(operation, num1, num2)
    }

}
