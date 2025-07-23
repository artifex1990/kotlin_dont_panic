package lesson_16.task_3

fun main() {
    val user = User("user_1", "Aa123456")

    if (user.checkPassword("Aa123456")) {
        println("Пароль верный")
    } else {
        println("Неверный пароль")
    }
}

class User(
    private val login: String,
    private val password: String,
) {
    fun checkPassword(password: String): Boolean = this.password == password
}