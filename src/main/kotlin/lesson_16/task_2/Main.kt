package lesson_16.task_2

import kotlin.math.pow

private const val PI = 3.14

fun main() {
    val circle = Circle(5.0)

    println("Длина окружности: %.02f".format(circle.getCircumference()))
    println("Площадь окружности: %.02f".format(circle.getArea()))
}

class Circle(
    private val radius: Double
) {
    fun getCircumference(): Double = 2 * PI * radius
    fun getArea(): Double = PI * radius.pow(2)
}