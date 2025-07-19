package lesson_11.task_2

fun main() {
    val user = User(
        id = 1,
        login = "abcd",
        password = "*******",
        email = "mail@mail.ru",
    )

    user.setBio()
    user.setPassword()

    user.showInfo()
}

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun showInfo() {
        println("User info:")
        println("id = $id")
        println("login = $login")
        println("password = $password")
        println("email = $email")
        println("bio = $bio")
    }

    fun setBio() {
        print("bio = ")
        bio = readln()
    }

    fun setPassword() {
        print("Введите текущий пароль ")
        val currentPass = readln()

        if (currentPass == password) {
            print("Введите новый пароль ")
            password = readln()
            println("Пароль успешно обновлен!")
        } else {
            println("Пароль не верный!")
        }
    }
}