package lesson_12.task_1

fun main() {
    val weather1 = Weather()
    weather1.dailyTemperature = "20C"
    weather1.nightTemperature = "14C"
    weather1.precipitationDuringDay = true
    weather1.showInfo()

    println()

    val weather2 = Weather()
    weather2.dailyTemperature = "18C"
    weather2.nightTemperature = "12C"
    weather2.precipitationDuringDay = false
    weather2.showInfo()
}

class Weather {
    var dailyTemperature = ""
    var nightTemperature = ""
    var precipitationDuringDay = false

    fun showInfo() {
        println("Погода за день")
        println("дневная температура: $dailyTemperature")
        println("ночная температура: $nightTemperature")
        println("наличие осадков в течение суток: ${if (precipitationDuringDay) "есть" else "нет"}")
    }
}