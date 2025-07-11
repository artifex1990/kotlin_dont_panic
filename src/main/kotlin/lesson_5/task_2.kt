package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите ваш год рождения ")
    val userYear = readln().toInt()
    val currentYear = 2025

    val userAge = currentYear - userYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Главная страница")
    }
}