package lesson_4

const val DAY_CHANGED = 2

fun main() {
    val dayTraining = 5

    val groupHandAndCore = dayTraining % DAY_CHANGED == 1

    println("""
        |Упражнения для рук:    $groupHandAndCore
        |Упражнения для ног:    ${!groupHandAndCore}
        |Упражнения для спины:  ${!groupHandAndCore}
        |Упражнения для пресса: $groupHandAndCore
    """.trimMargin())
}
