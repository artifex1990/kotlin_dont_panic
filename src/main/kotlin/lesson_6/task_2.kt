package lesson_6

const val MILLISECONDS_IN_SECOND: Long = 1000

fun main() {
    print("Количество секунд: ")
    val totalSeconds = readln().toInt()

    Thread.sleep(totalSeconds * MILLISECONDS_IN_SECOND)

    println("Прошло $totalSeconds секунды")
}