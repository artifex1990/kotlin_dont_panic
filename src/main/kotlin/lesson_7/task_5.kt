package lesson_7

const val MIN_LENGTH_PASSWORD = 6

fun main() {
    println("Генератор паролей")
    println("Минимальный размер пароля должен быть 6")
    print("Введите размер пароля ")
    val maxLimitPassword = readln().toInt()

    if (maxLimitPassword < MIN_LENGTH_PASSWORD) {
        println("Заданный пароль имеет длину меньше минимального пароля")
        println("Длина пароля пользователя $maxLimitPassword, минимально возможная длина $MIN_LENGTH_PASSWORD")
        return
    }

    val limitRangeAction = 1..3
    val intRange = '0'..'9'
    val charLowerRange = 'a'..'z'
    val charUpperRange = 'A'..'Z'
    val passwordAfterInitRange = 4..maxLimitPassword

    val password = mutableListOf(
        intRange.random(),
        charLowerRange.random(),
        charUpperRange.random(),
    )

    for (i in passwordAfterInitRange) {
        val genSymbol = when ((limitRangeAction).random()) {
            1 -> intRange.random()
            2 -> charLowerRange.random()
            3 -> charUpperRange.random()
            else -> '?'
        }

        password.add(genSymbol)
    }

    println("Ваш сгенерированный пароль: ${password.shuffled().joinToString("")}")
}