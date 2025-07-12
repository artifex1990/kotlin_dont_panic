package lesson_5

import kotlin.math.pow

const val GROWTH_BASE = 100
const val WEIGHT_MINIMAL_BASE = 18.5
const val WEIGHT_MIDDLE_BASE = 25.0
const val WEIGHT_MAXIMAL_BASE = 30.0

fun main() {
    println("Индекс массы тела (ИМТ)")
    print("Введите ваш вес в кг ")
    val userWeight: Double = readln().toDouble()

    print("Введите ваш рост в см ")
    val userGrowth: Double = readln().toDouble()

    val imt = userWeight / (userGrowth / GROWTH_BASE).pow(2)

    println("Вердикт по вашим показателям!")
    when {
        imt < WEIGHT_MINIMAL_BASE -> println("Недостаточная масса тела")
        imt >= WEIGHT_MINIMAL_BASE && imt < WEIGHT_MIDDLE_BASE -> println("Нормальная масса тела")
        imt >= WEIGHT_MIDDLE_BASE && imt < WEIGHT_MAXIMAL_BASE -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }

    println("Ваш ИМТ %.02f".format(imt))
}