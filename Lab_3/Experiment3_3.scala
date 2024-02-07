package Lab_3

object Experiment3_3 {
    def good_morning(UserName: String = "Jainil"): Unit = {
        println(s"good morning fam, how you doin, $UserName")
    }
    def main(args: Array[String]): Unit = {
        good_morning()
        good_morning("Ayush")
    }
}
