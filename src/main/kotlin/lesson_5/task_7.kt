package lesson_5

fun main() {
    println("Калькулятор топлива")
    print("Расстояние поездки (в километрах) ")
    val distanceTrip = readln().toDouble()

    print("Расход топлива на 100 км (в литрах) ")
    val fuelConsumption = readln().toDouble()

    print("Цена за литр топлива ")
    val pricePerLiter = readln().toDouble()

    val commonFuelLiter = (distanceTrip * fuelConsumption) / 100
    val commonCostFuel = commonFuelLiter * pricePerLiter

    println("Общее количество необходимого топлива поездки %.02f л".format(commonFuelLiter))
    println("Итоговая стоимость поездки %.02f руб.".format(commonCostFuel))
}