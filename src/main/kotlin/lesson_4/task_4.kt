package lesson_4

const val DAY_CHANGED = 2

fun main() {
    val dayTraining = 5

    val groupHandAndCore = dayTraining % DAY_CHANGED == 1
    val groupLegsAndBack = dayTraining % DAY_CHANGED == 0

    println("""
        |Упражнения для рук:    $groupHandAndCore
        |Упражнения для ног:    $groupLegsAndBack
        |Упражнения для спины:  $groupLegsAndBack
        |Упражнения для пресса: $groupHandAndCore
    """.trimMargin())
}
