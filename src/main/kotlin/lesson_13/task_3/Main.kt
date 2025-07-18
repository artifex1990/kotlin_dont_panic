package lesson_13.task_3

import kotlin.random.Random
import kotlin.random.nextLong

fun main() {
    val maxLimitPhoneNumbers = 5
    val phonesRange = 9000000000..9999999999
    val subscribers = List(maxLimitPhoneNumbers) {
        Subscriber(
            name = "name_$it",
            phone = Random.nextLong(phonesRange),
            company = "company_$it"
        )
    }
    subscribers[0].company = null
    subscribers[1].company = null
    subscribers[2].company = "null"

    val existingCompanies = subscribers
        .mapNotNull { it.company }
        .toSet()

    println("Список существующих компаний:")
    existingCompanies.forEach { company -> println(company) }
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