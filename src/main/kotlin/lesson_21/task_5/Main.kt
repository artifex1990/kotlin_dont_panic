package lesson_21.task_5

fun main() {
    val skills = mapOf(
        "Сила" to 50,
        "Ловкость" to 75,
        "Интеллект" to 75
    )

    println("Первый из самых прокаченных навыков: ${skills.maxCategory()}")
}

fun Map<String, Int>.maxCategory() = this.maxByOrNull { it.value }?.key ?: ""