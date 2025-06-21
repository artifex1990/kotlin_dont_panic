package lesson_2

fun main() {
    val scoresStudent1: Float = 3f
    val scoresStudent2: Float = 4f
    val scoresStudent3: Float = 3f
    val scoresStudent4: Float = 5f
    val avg: Float = (scoresStudent1 + scoresStudent2 + scoresStudent3 + scoresStudent4) / 4

    println("%.02f".format(avg))
}