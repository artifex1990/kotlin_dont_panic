package lesson_6

import kotlin.random.Random

const val MIN_LIMIT_N = 1
const val MAX_LIMIT_N = 10

fun main() {
    var attemptsLeft = 3

    println("Здравствуйте. Для авторизации в системе решите простой пример!")
    while (0 < attemptsLeft) {
        val generatedNum1 = Random.nextInt(MIN_LIMIT_N, MAX_LIMIT_N)
        val generatedNum2 = Random.nextInt(MIN_LIMIT_N, MAX_LIMIT_N)

        print("$generatedNum1 + $generatedNum2 = ")
        val userAnswer = readln().toInt()

        if (userAnswer == generatedNum1 + generatedNum2) {
            println("Добро пожаловать!")
            return
        }

        attemptsLeft--
    }

    println("Доступ запрещен")
}