package Lab_2

object Experiment2_4 {
    def main(args: Array[String]): Unit = {     
        for (i <- 0 to 30) {
            if (i % 2 == 0) {
                println(s"$i is a even number")
            } else {
                println(s"$i is a odd number")
            }
        }
    }
}
