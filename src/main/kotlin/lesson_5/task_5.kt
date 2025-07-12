package lesson_5

import kotlin.random.Random

fun main() {
    val minLotteryNum = 0
    val maxLotteryNum = 42
    val maxNumbersInList = 3
    val randomValues = List(maxNumbersInList) { Random.nextInt(minLotteryNum, maxLotteryNum + 1) }

    println("Попробуйте угадать $maxNumbersInList числа из диапазона 0 - 42")
    print("Введите число 1 = ")
    val userInput1 = readln().toInt()

    print("Введите число 2 = ")
    val userInput2 = readln().toInt()

    print("Введите число 3 = ")
    val userInput3 = readln().toInt()

    val userNumbers = listOf(userInput1, userInput2, userInput3)

    val userGuessedNumbersCount = randomValues.intersect(userNumbers).size

    when(userGuessedNumbersCount) {
        maxNumbersInList -> println("Поздравляем! Вы выиграли Джекпот!!!")
        maxNumbersInList - 1 -> println("Вы выиграли крупный приз!!")
        maxNumbersInList - 2 -> println("Вы выиграли утешительный приз!")
        else -> println("Вы не угадали ни одного числа!")
    }

    println("Введенные числа: ${userNumbers.joinToString(", ")}")
    println("Выигрышные числа: ${randomValues.joinToString(", ")}")
}