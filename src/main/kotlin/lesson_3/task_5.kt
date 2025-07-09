package lesson_3

fun main() {
    val userStep = "D2-D4;0"
    val (stepTo, stepFrom, numberOfStep) = userStep.split("-", ";")

    println(stepTo)
    println(stepFrom)
    println(numberOfStep)
}