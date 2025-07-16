package lesson_10

fun main() {
    println("Генератор паролей")
    print("Введите длину пароля: ")
    val length = readln().toInt()

    val password = generatePassword(length)
    println("Ваш пароль: $password")
}

fun generatePassword(length: Int): String {
    val digits = 0..9
    val specialChars = ' '..'/'
    var password = ""

    for (i in 0 until length) {
        password += if (i % 2 == 0) digits.random() else specialChars.random()
    }

    return password
}