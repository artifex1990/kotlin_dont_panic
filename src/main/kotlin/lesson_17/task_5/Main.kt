package lesson_17.task_5

fun main() {
    val user = User("user 1", "avbn")

    println("User login: ${user.login}")
    println("User password: ${user.password}")

    println("Попытка сменить пароль")
    user.password = "123567"

    println("Изменение логина!")
    user.login = "user 2"

    println("User login: ${user.login}")
}

class User(
    login: String,
    password: String,
) {
    var login: String = login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var password: String = password
        get() = String(CharArray(field.length) { '*' })
        set(value) {
            println("Вы не можете изменить пароль")
        }
}