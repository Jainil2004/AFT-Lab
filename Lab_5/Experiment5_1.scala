package Lab_5

// crete a class named 'student' with string variable and integer variable 'roll_no'. assign the value of roll_no and name by creating an object of the class Student
//code written by Jainil Jain
class student(rollno: Int, name: String) {
    def show_details(): Unit = {
        println(s"roll_no: $rollno\nName: $name")
    }
}

object Experiment5_1 {
    def main(args: Array[String]): Unit = {
        var stu1 = new student(178514735, "Jainil Jain")
        stu1.show_details()
    }
}
