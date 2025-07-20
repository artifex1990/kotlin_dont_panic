package lesson_14.task_3

import kotlin.math.pow
import kotlin.random.Random

const val COLOR_BLACK = "black"
const val COLOR_WHITE = "white"

fun main() {
    val limitMin = 0.0
    val limitMax = 10.0
    val figures = arrayOf(
        Rectangle(
            Random.nextDouble(limitMin, limitMax),
            Random.nextDouble(limitMin, limitMax),
            COLOR_WHITE
        ),
        Circle(
            Random.nextDouble(limitMin, limitMax),
            COLOR_WHITE
        ),
        Rectangle(
            Random.nextDouble(limitMin, limitMax),
            Random.nextDouble(limitMin, limitMax),
            COLOR_BLACK
        ),
        Circle(
            Random.nextDouble(limitMin, limitMax),
            COLOR_BLACK
        ),
    )
    val sumPerimetersBlackFigure = figures.filter { it.color == COLOR_BLACK }.sumOf { it.perimeter() }
    val sumAreasWhiteFigure = figures.filter { it.color == COLOR_WHITE }.sumOf { it.area() }

    println("Сумма периметров всех черных фигур: %.02f".format(sumPerimetersBlackFigure))
    println("Сумма площадей всех белых фигур: %.02f".format(sumAreasWhiteFigure))
}

abstract class Figure(
    open val color: String,
) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Rectangle(
    val width: Double,
    val height: Double,
    override val color: String,
) : Figure(color) {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
}

class Circle(
    val radius: Double,
    override val color: String,
) : Figure(color) {
    override fun area(): Double = Math.PI.pow(2) * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
}
