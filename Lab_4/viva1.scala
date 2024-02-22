package Lab_4

object viva1 {
    def fibo(n_till:Int): Unit = {
        var num1:Int = 0
        var num2:Int = 1
        var next = num1+num2
        print(s"$num1, $num2, $next")

        while(next <= n_till) {
            num1 = num2
            num2 = next
            next = num1 + num2
            print(s" ,$next")
        }
    }
    def main(args: Array[String]): Unit = {
        fibo(5)
    }

}
