package lesson_18.task_5

fun main() {
    val screen = Screen()
    val circle = Circle(5)
    val square = Square(10)
    val point = Point()

    println(screen.draw(circle, 10, 20))
    println(screen.draw(circle, 10.5f, 20.3f))

    println(screen.draw(square, 30, 40))
    println(screen.draw(square, 30.7f, 40.2f))

    println(screen.draw(point, 50, 60))
    println(screen.draw(point, 50.1f, 60.9f))
}

class Screen {
    fun draw(shape: Circle, x: Int, y: Int): String {
        return "Рисуем круг (int координаты) в ($x, $y) с радиусом ${shape.radius}"
    }

    fun draw(shape: Circle, x: Float, y: Float): String {
        return "Рисуем круг (float координаты) в " +
                "(${"%.1f".format(x)}, ${"%.1f".format(y)}) с радиусом ${shape.radius}"
    }

    fun draw(shape: Square, x: Int, y: Int): String {
        return "Рисуем квадрат (int координаты) в ($x, $y) со стороной ${shape.size}"
    }

    fun draw(shape: Square, x: Float, y: Float): String {
        return "Рисуем квадрат (float координаты) в " +
                "(${"%.1f".format(x)}, ${"%.1f".format(y)}) со стороной ${shape.size}"
    }

    fun draw(shape: Point, x: Int, y: Int): String {
        return "Рисуем точку (int координаты) в ($x, $y)"
    }

    fun draw(shape: Point, x: Float, y: Float): String {
        return "Рисуем точку (float координаты) в " +
                "(${"%.1f".format(x)}, ${"%.1f".format(y)})"
    }
}

class Circle(val radius: Int)
class Square(val size: Int)
class Point

