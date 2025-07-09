package lesson_1

fun main() {
    var ordersPerDay: Long = 75
    var staffNumber: Int = 2000
    val staffLessYesterday: Int = 6
    val gratitudeForPurchase: String = "Спасибо за покупку!"

    ordersPerDay += 1

    println("Количество покупок за день: $ordersPerDay")
    println(gratitudeForPurchase)

    //println("Количество сотрудников работающих в интернет магазине: $staffNumber человек")

    println("Вчера от нас ушло $staffLessYesterday человек!")
    staffNumber -= staffLessYesterday

    println("Сейчас работает: $staffNumber человек")
}
