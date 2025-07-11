package lesson_2

fun main() {
    val scoresStudent1 = 3.0
    val scoresStudent2 = 4.0
    val scoresStudent3 = 3.0
    val scoresStudent4 = 5.0
    val numberOfStudents = 4

    val avg = (scoresStudent1 + scoresStudent2 + scoresStudent3 + scoresStudent4) / numberOfStudents

    println("%.02f".format(avg))
}