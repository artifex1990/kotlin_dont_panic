package lesson_7

const val ONE_SECOND: Long = 1000

fun main() {
    print("Введите количество секунд для задержки ")
    val numbersSecond = readln().toInt()

    for (i in numbersSecond downTo 1) {
        println("Времени осталось: $i секунд")
        Thread.sleep(ONE_SECOND)
    }

    println("Время вышло")
}