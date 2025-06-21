package org.example.lesson_1

fun main() {
    val year: Short = 1961
    var hour: Byte = 9
    var minute: Byte = 7

    println("Год полета – $year")
    print("Взлет – ")
    print("%02d:".format(hour))
    println("%02d".format(minute))

    hour = 10
    minute = 55
    println("Посадка – %02d:%02d".format(hour, minute))
}
