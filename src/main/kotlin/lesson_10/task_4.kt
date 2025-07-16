package lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

const val ANSWER_YES = "да"

fun main() {
    var userWin = 0;

    println("Добро пожаловать в игру Кости!")
    println("Игрок и компьютер бросают кубик. У кого больше - тот победил!")

    do {
        if (playRound()) userWin++

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userAnswer = readln()
    } while (userAnswer.equals(ANSWER_YES, true))

    println("Количество выигранных человеком $userWin партий")
}

fun rollDice(): Int = Random.nextInt(1..6)
fun playRound(): Boolean {
    val playerRoll = rollDice()
    println("Игрок бросает кубик... Выпало: $playerRoll")

    val computerRoll = rollDice()
    println("Компьютер бросает кубик... Выпало: $computerRoll")

    return when {
        playerRoll > computerRoll -> {
            println("Победило человечество!")
            true
        }

        computerRoll > playerRoll -> {
            println("Победила машина!")
            false
        }

        else -> {
            println("Победила дружба!")
            false
        }
    }
}