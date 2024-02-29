package Lab_5

// write a program to print the area and parameter of a triangle having sides 3, 4, 5 by creating a class named 'triangle' without any parameters in its constructor
// code written by Jainil Jain

class Traingle_5_2 {
    def area_of_traingle(height: Int, base: Int): Double = {
        return (0.5 * height * base)
    }

    def parameter_of_traingle(s1: Int, s2: Int, s3: Int): Int = {
        return (s1 + s2 + s3)
    }
}
object Experiment5_2 {
    def main(args: Array[String]): Unit = {
        var new_triangle = new Traingle_5_2()
        var area = new_triangle.area_of_traingle(3, 4)
        var parameter = new_triangle.parameter_of_traingle(3, 4, 5)

        println(s"area of triangle = $area\n parameter of the triangle = $parameter")
    }
}
