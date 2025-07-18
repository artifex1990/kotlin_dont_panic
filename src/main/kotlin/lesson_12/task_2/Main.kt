package lesson_12.task_2

fun main() {
    val weather1 = Weather(
        dailyTemperature = "20C",
        nightTemperature = "14C",
        precipitationDuringDay = true,
    )
    weather1.showInfo()

    println()

    val weather2 = Weather(
        dailyTemperature = "18C",
        nightTemperature = "12C",
        precipitationDuringDay = false,
    )
    weather2.showInfo()
}

class Weather(
    val dailyTemperature: String,
    val nightTemperature: String,
    val precipitationDuringDay: Boolean,
) {
    fun showInfo() {
        println("Погода за день")
        println("дневная температура: $dailyTemperature")
        println("ночная температура: $nightTemperature")
        println("наличие осадков в течение суток: ${if (precipitationDuringDay) "есть" else "нет"}")
    }
}