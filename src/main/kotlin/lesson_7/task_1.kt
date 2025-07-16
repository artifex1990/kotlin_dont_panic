package lesson_7

fun main() {
    val passwordRange = 1..3
    val intRange = 0..9
    val charRange = 'a'..'z'
    var password = ""

    for (i in passwordRange) {
        password += "${charRange.random()}${intRange.random()}"
    }

    println(password)
}