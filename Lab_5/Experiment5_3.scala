package Lab_5

// solution of Lab 5 Q3
// code written by Jainil Jain

class area_5_3(length: Int, breadth: Int) {
    def return_area(): Int = {
        return (length * breadth)
    }
}
object Experiment5_3 {
    def main(args: Array[String]): Unit = {
        println("please enter the length of the rectangle")
        var length = scala.io.StdIn.readInt()
        println("please enter the breadth of the rectangle")
        var breadth = scala.io.StdIn.readInt()

        var rect1 = new area_5_3(length, breadth)
        var area_result = rect1.return_area()

        println(s"the area of the rectangle with length = $length and breadth = $breadth is $area_result")
    }
}
