package lesson_7

fun main() {
    println("Введите максимальное число до которого мы будем выводить последовательность")
    print("Ваше число ")
    val maxLimit = readln().toInt()
    val evenRange = 2..maxLimit step 2

    println(evenRange.joinToString(", "))
}