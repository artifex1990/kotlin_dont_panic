package lesson_18.task_4

fun main() {
    val packages = listOf(
        RectangularPackage(2.0, 3.0, 4.0),
        CubePackage(3.0),
    )

    packages.forEach { println("$it - Площадь поверхности: ${it.surfaceArea()}") }
}

abstract class Package {
    abstract fun surfaceArea(): Double
}

class RectangularPackage(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Package() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }

    override fun toString(): String {
        return "Прямоугольная коробка (${length}x${width}x${height})"
    }
}

class CubePackage(private val edgeLength: Double) : Package() {
    override fun surfaceArea(): Double {
        return 6 * edgeLength * edgeLength
    }

    override fun toString(): String {
        return "Кубическая коробка (ребро $edgeLength)"
    }
}

