package Lab_4

object Experiment4_3 {
//    code written by Jainil jain
//    create anonymous functions isEven, isOdd, isPositive, isNegative, isZero and a higher order function 'filterList'
    def filterList(numToCheck: Int, op: Int): String = {
        op match {
            case 1 => {
                if (numToCheck % 2 == 0) "is even" else "is odd"
            }
            case 2 => {
                if (numToCheck % 2 != 0) "is odd" else "is even"
            }
            case 3 => {
                if (numToCheck > 0) "is positive" else "is negetive"
            }
            case 4 => {
                if (numToCheck < 0) "is negetive" else "is positive"
            }
            case 5 => {
                if (numToCheck == 0) "is zero" else "is not zero"
            }
        }
    }
    def main(args: Array[String]): Unit = {
        println(filterList(1, 1))
        println(filterList(1, 2))
        println(filterList(1, 3))
        println(filterList(1, 4))
        println(filterList(1, 5))
    }
}
