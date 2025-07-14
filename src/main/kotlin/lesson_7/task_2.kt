package lesson_7

fun main() {
    val smsPasswordRange = 1000..9999

    do {
        val smsGeneratedPassword = smsPasswordRange.random()
        println("Ваш код авторизации: $smsGeneratedPassword")

        print("Введите код авторизации, для подтверждения операции. код = ")
        val userSmsPassword = readln().toInt()

        if (userSmsPassword == smsGeneratedPassword) {
            println("Пароль подтвержден. Добро пожаловать в систему!")
            break
        } else {
            println("Вы ошиблись. Попробуйте ввести код повторно!")
        }
    } while (true)
}