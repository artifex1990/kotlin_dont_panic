package lesson_15.task_2

fun main() {
    val server = WeatherServer()
    server.sendMessage(Temperature("21 C"))
    server.sendMessage(PrecipitationAmount(22.5))
}

abstract class WeatherStationStats()

class Temperature(
    val value: String
) : WeatherStationStats() {
    fun showTemperature() {
        println("Температура $value")
    }
}

class PrecipitationAmount(
    val value: Double
) : WeatherStationStats() {
    fun showPrecipitation() {
        println("Осадки: $value")
    }
}

class WeatherServer() {
    fun sendMessage(weather: WeatherStationStats) {
        when(weather) {
            is PrecipitationAmount -> weather.showPrecipitation()
            is Temperature -> weather.showTemperature()
            else -> println("Не распознал тип")
        }
    }
}