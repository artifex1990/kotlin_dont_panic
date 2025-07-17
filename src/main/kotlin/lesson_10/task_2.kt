package lesson_10

const val MAX_LENGTH = 4

fun main() {
    println("Добро пожаловать введите логи и пароль!")

    print("Логин ")
    val login = getUserData()

    print("Пароль ")
    val password = getUserData()

    if (checkingSize(login) && checkingSize(password)) {
        println("Добро пожаловать")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun getUserData(): String = readln()
fun checkingSize(stringForCheck : String): Boolean = stringForCheck.length >= MAX_LENGTH