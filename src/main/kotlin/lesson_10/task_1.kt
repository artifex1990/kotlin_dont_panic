package lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("Добро пожаловать в игру Кости!")
    println("Игрок и компьютер бросают кубик. У кого больше - тот победил!")

    val playerRoll = rollDice()
    println("Игрок бросает кубик... Выпало: $playerRoll")

    val computerRoll = rollDice()
    println("Компьютер бросает кубик... Выпало: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Победило человечество!")
        computerRoll > playerRoll -> println("Победила машина!")
        else -> println("Победила дружба!")
    }
}

fun rollDice(): Int = Random.nextInt(1..6)
