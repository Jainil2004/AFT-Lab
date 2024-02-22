package Lab_4

object Experiment4_1 {
    //    code written by Jainil Jain
    //    scala program to read a weekday number and print weekday name using match case

    def weekday(dayno: Int): Unit = {
        dayno match {
            case 1 => println("Monday")
            case 2 => println("Tuesday")
            case 3 => println("Wednesday")
            case 4 => println("Thursday")
            case 5 => println("Friday")
            case 6 => println("Saturday")
            case 7 => println("Sunday")
            case _ => println("invalid")
        }
    }
    def main(args: Array[String]): Unit = {
        println("enter a day number from 1 to 7")
        var dayno = scala.io.StdIn.readInt();
        weekday(dayno)
    }
}
