package lesson_5

const val SECRET_KEY = 13

fun main() {
    print("Подтвердите что вы человек, решите уравнение 6 + 7 = ")
    val userInput = readln().toInt()

    if (userInput == SECRET_KEY) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}