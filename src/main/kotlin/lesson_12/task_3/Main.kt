package lesson_12.task_3

fun main() {
    val weather1 = Weather(
        dailyTemperatureKelvin = 293,
        nightTemperatureKelvin = 287,
        precipitationDuringDay = true
    )
    weather1.showInfo()

    println()

    val weather2 = Weather(
        dailyTemperatureKelvin = 273,
        nightTemperatureKelvin = 267,
        precipitationDuringDay = false
    )
    weather2.showInfo()
}

class Weather(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    precipitationDuringDay: Boolean,
) {
    val dailyTemperature: Int = dailyTemperatureKelvin - 273
    val nightTemperature: Int = nightTemperatureKelvin - 273
    val _precipitationDuringDay: Boolean = precipitationDuringDay

    fun showInfo() {
        println("Погода за день")
        println("дневная температура: $dailyTemperature C")
        println("ночная температура: $nightTemperature C")
        println("наличие осадков в течение суток: ${if (_precipitationDuringDay) "есть" else "нет"}")
    }
}