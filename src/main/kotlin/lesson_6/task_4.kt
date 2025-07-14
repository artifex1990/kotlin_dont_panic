package lesson_6

import kotlin.random.Random

const val MIN_LIMIT_NUM = 1
const val MAX_LIMIT_NUM = 10

fun main() {
    val secretNumber = Random.nextInt(MIN_LIMIT_NUM, MAX_LIMIT_NUM)
    var attemptsLeft = 5

    println("Угадайте число от 1 до 9. У вас есть $attemptsLeft попыток.")

    while (attemptsLeft > 0) {
        print("Ваш вариант: ")
        val guess = readln().toInt()

        if (guess == secretNumber) {
            println("Это была великолепная игра!")
            return
        }

        attemptsLeft--
        println("Неверно! Осталось попыток: $attemptsLeft")
    }

    println("Было загадано число $secretNumber")
}