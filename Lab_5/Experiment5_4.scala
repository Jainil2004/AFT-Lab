package Lab_5

// write a program to print the area and perimeter of a triangle by creating a class traingle with an auxillary constructor having the three sides as a parameter
// code written by Jainil Jain
class traingle_5_4{
    var height = 0
    var base = 0
    var hypo = 0
    def this(height: Int, base: Int, hypo: Int) {
        this()
        this.height = height
        this.base = base
        this.hypo = hypo
    }
    def area_of_traingle(): Double = {
        return (0.5 * height * base)
    }

    def parameter_of_traingle(): Int = {
        return (height + base + hypo)
    }
}
object Experiment5_4 {
    def main(args: Array[String]): Unit = {
        var t1 = new traingle_5_4(3, 4, 5)
        var area = t1.area_of_traingle()
        var perimeter = t1.parameter_of_traingle()
        println(s"area = $area , perimeter = $perimeter")
    }
}
