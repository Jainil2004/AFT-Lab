package Lab_4

object Experiemnt4_3_n1 {
//    code written by Jainil Jain
//    create functions isEven, isOdd, isPositive, isZero. create a higher order function filterlist that takes a list
//    of numbers and any one filter function created above

    def filterlist(f: Int => String, num:Int): String = {
        f(num);
    }
    def isEven(num1: Int): String = {
        if (num1 % 2 == 0) "is even" else "is odd"
    }

    def isOdd(num1: Int): String = {
        if (num1 % 2 != 0) "is odd" else "is even"
    }

    def isPositive(num1: Int): String = {
        if (num1 > 0) "is positive" else "is negetive"
    }

    def isNegetive(num1: Int): String = {
        if (num1 < 0) "is negetive" else "is positive"
    }

    def isZero(num1: Int): String = {
        if (num1 == 0) "is zero" else "not zero"
    }
    def main(args: Array[String]): Unit = {
        println("enter a valid operation")
        val op = scala.io.StdIn.readInt()

        println("enter a number")
        val num = scala.io.StdIn.readInt()
        var result:String = null

        op match {
            case 1 => result = filterlist(isEven, num)
            case 2 => result = filterlist(isOdd, num)
            case 3 => result = filterlist(isPositive, num)
            case 4 => result = filterlist(isNegetive, num)
            case 5 => result = filterlist(isZero, num)
        }
        println(result)
    }

}
