package lesson_16.task_1

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    GameCubic().getNumber()
}

class GameCubic {
    private val randomNumber: Int;

    init {
        val limitRange = 1..6
        randomNumber = Random.nextInt(limitRange)
    }

    fun getNumber() {
        println("Бросаем кубик, выпало число: $randomNumber")
    }
}