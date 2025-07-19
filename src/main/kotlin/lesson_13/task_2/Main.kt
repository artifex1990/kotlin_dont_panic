package lesson_13.task_2

fun main() {
    val subscriber = Subscriber(
        name = "Ростислав",
        phone = 89087253564,
        company = "Reddit",
    )

    subscriber.showInfo()
}

class Subscriber(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {
    fun showInfo() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $phone\n" +
                    "- Компания: ${company ?: "<не указано>"}"
        )
    }
}