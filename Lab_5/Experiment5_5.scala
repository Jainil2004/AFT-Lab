package Lab_5

// create a base class called shape with a method draw. then, create subclasses circle, rectangle, and triangle that override the draw method to draw their
// respective shapes
// code written by Jainil Jain
class shape_5_5 {
    def draw(): Unit = {
        println("drawing a shape")
    }
}

class rectangle extends shape_5_5 {
    override def draw(): Unit = {
        println("drawing a rectangle")
    }
}

class cirle extends shape_5_5 {
    override def draw(): Unit = {
        println("drawing a circle")
    }
}

class traingle_1 extends shape_5_5 {
    override def draw(): Unit = {
        println("drawing a triangle")
    }
}
object Experiment5_5 {
    def main(args: Array[String]): Unit = {
        var shape = new shape_5_5()
        var rectangle = new rectangle()
        var circle = new cirle()
        var triangle_1 = new traingle_1()

        shape.draw()
        rectangle.draw()
        circle.draw()
        triangle_1.draw()
    }
}
