package org.example.lesson_1

fun main() {
    val commonSecondsInSpace: Short = 6495
    val secondsInSpace: Byte = (commonSecondsInSpace % 60).toByte()
    val minutesInSpace: Byte = (commonSecondsInSpace / 60 % 60).toByte()
    val hoursInSpace: Byte = (commonSecondsInSpace / 60 / 60 % 24).toByte()

    println(
        "Время проведенное в космосе %02d:%02d:%02d".format(
            hoursInSpace, minutesInSpace, secondsInSpace
        )
    )
}
