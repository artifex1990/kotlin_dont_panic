package lesson_8

fun main() {
    val numbersWatchedOnWeek = intArrayOf(0, 0, 0, 0, 0, 0, 0)

    for (i in 0 until numbersWatchedOnWeek.size) {
        print("Введите количество просмотров за ${i + 1} день недели: ")
        numbersWatchedOnWeek[i] = readln().toInt()
    }

    println("Общее количество просмотров за неделю: ${numbersWatchedOnWeek.sum()} просмотров")
}