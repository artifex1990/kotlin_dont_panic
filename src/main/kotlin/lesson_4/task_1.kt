package lesson_4

const val COMMON_TABLES_IN_RESTAURANT = 13

fun main() {
    val bookedTableToday = 13
    val bookedTableTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${bookedTableToday < COMMON_TABLES_IN_RESTAURANT}\n" +
                "Доступность столиков на завтра: ${bookedTableTomorrow < COMMON_TABLES_IN_RESTAURANT}"
    )
}
