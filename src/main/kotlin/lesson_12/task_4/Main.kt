package lesson_12.task_4

fun main() {
    Weather(
        dailyTemperatureKelvin = 293,
        nightTemperatureKelvin = 287,
        precipitationDuringDay = true
    )

    println()

    Weather(
        dailyTemperatureKelvin = 273,
        nightTemperatureKelvin = 267,
        precipitationDuringDay = false
    )
}

class Weather(
    dailyTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    precipitationDuringDay: Boolean,
) {
    val dailyTemperature: Int = dailyTemperatureKelvin - 273
    val nightTemperature: Int = nightTemperatureKelvin - 273
    val _precipitationDuringDay: Boolean = precipitationDuringDay

    init {
        showInfo()
    }

    fun showInfo() {
        println("Погода за день")
        println("дневная температура: $dailyTemperature C")
        println("ночная температура: $nightTemperature C")
        println("наличие осадков в течение суток: ${if (_precipitationDuringDay) "есть" else "нет"}")
    }
}