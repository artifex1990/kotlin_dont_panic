package lesson_6

const val MILLISECONDS_IN_SECOND: Long = 1000

fun main() {
    print("Количество секунд: ")
    var totalSeconds = readln().toInt()

    while (0 < totalSeconds) {
        println("Осталось секунд: $totalSeconds")
        totalSeconds--
        Thread.sleep(MILLISECONDS_IN_SECOND)
    }

    println("Время вышло")
}