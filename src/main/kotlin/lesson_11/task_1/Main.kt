package lesson_11.task_1

fun main() {
    val user1 = User(
        1,
        "abcd",
        "*******",
        "mail@mail.ru"
    )

    val user2 = User(
        2,
        "qwerty",
        "*******",
        "qwe@qwe.ru"
    )

    println("User 1:")
    println("id = ${user1.id}")
    println("login = ${user1.login}")
    println("password = ${user1.password}")
    println("email = ${user1.email}")

    println()

    println("User 2:")
    println("id = ${user2.id}")
    println("login = ${user2.login}")
    println("password = ${user2.password}")
    println("email = ${user2.email}")
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
}