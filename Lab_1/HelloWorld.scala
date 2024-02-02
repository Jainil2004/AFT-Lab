package Lab_1

object HelloWorld {
    def main(args: Array[String]): Unit = {
        var x: Int = 5
        x = 10 // this is allowed

        val y: Int = 7
        // y = 9 // this will result in a compilation error because it is immutable

        val (a, b, c) = (10, "hello", 3.14)

        println(s"a: $a, b: $b, c: $c")
    }
}
