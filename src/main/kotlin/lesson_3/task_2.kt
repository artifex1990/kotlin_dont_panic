package lesson_3

fun main() {
    val userName = "Татьяна"
    val userLastname = "Сергеевна"

    var userSurname = "Андреева"
    var userAge = 20

    println("$userSurname $userName $userLastname, $userAge")

    userSurname = "Сидорова"
    userAge = 22

    println("$userSurname $userName $userLastname, $userAge")
}