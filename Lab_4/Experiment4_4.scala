package Lab_4

object Experiment4_4 {
//    code written by Jainil Jain
        def toUpper(string: String): String = {
            string.toUpperCase()
        }

        def toLower(string: String): String = {
            string.toLowerCase()
        }

        def reverse(string: String): String = {
            string.reverse
        }

        def formatNames(name: String, f: String => String): String = {
            f(name)
        }

        def main(args: Array[String]): Unit = {
            val name = "JaInIL JAin"
            println("original string = " + name)
            println(formatNames(name, toUpper))
            println(formatNames(name, toLower))
            println(formatNames(name, reverse))
        }
}
