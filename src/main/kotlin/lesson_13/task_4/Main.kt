package lesson_13.task_4

fun main() {
    val maxLimitPhoneNumbers = 2
    val subscribers = mutableListOf<Subscriber>()

    for (i in 0 until maxLimitPhoneNumbers) {
        println("Создание контакта #${i + 1}:")

        print("Введите имя: ")
        val name = readlnOrNull() ?: "name_$i"

        print("Введите номер телефона (10 цифр): ")
        val phone = readlnOrNull()?.toLongOrNull()

        if (phone == null) {
            println("Ошибка: Некорректный номер телефона. Контакт не добавлен!")
            continue
        }

        print("Введите компанию (оставьте пустым, если нет): ")
        val company = readlnOrNull().takeIf { !it.isNullOrBlank() }

        subscribers.add(Subscriber(name, phone, company))
    }

    println("Список созданных объектов:")
    for (subscriber in subscribers) {
        subscriber.showInfo()
        println()
    }
}

class Subscriber(
    val name: String,
    val phone: Long,
    var company: String? = null
) {
    fun showInfo() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $phone\n" +
                    "- Компания: ${company ?: "<не указано>"}"
        )
    }
}