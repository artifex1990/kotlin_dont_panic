package lesson_13.task_5

fun main() {
    val maxLimitPhoneNumbers = 2

    for (i in 0 until maxLimitPhoneNumbers) {
        print("Введите номер телефона (10 цифр): ")
        try {
            readlnOrNull()?.toLong()
        } catch (e: Exception) {
            println("Ошибка: $e")
            continue
        }
    }
}