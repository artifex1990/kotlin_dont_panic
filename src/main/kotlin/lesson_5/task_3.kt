package lesson_5

fun main() {
    val lotteryNum1 = 18
    val lotteryNum2 = 36

    println("Попробуйте угадать два числа из диапазона 0 - 42")
    print("Введите число 1 = ")
    val inputNum1 = readln().toInt()

    print("Введите число 2 = ")
    val inputNum2 = readln().toInt()

    if (
        (lotteryNum1 == inputNum1 && lotteryNum2 == inputNum2) ||
        (lotteryNum1 == inputNum2 && lotteryNum2 == inputNum1)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (lotteryNum1 == inputNum1 ||
        lotteryNum1 == inputNum2 ||
        lotteryNum2 == inputNum1 ||
        lotteryNum2 == inputNum2
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Введенные числа: $inputNum1 и $inputNum2")
    println("Загаданные числа: $lotteryNum1 и $lotteryNum2")
}