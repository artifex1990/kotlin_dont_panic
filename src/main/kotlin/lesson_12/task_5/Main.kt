package lesson_12.task_5

import kotlin.math.roundToInt
import kotlin.random.Random
import kotlin.random.nextInt

const val PRECIPITATION_YES = true

fun main() {
    val weatherKelvinTemperatureLimit = 260..300
    val maxWeathersInfo = 30
    val weathers = List<Weather>(maxWeathersInfo) {
        Weather(
            dailyTemperatureKelvin = Random.nextInt(weatherKelvinTemperatureLimit),
            nightTemperatureKelvin = Random.nextInt(weatherKelvinTemperatureLimit),
            precipitationDuringDay = Random.nextBoolean()
        )
    }
    val dailyTemperatures = weathers.map { weather -> weather.dailyTemperature }
    val nightTemperatures = weathers.map { weather -> weather.nightTemperature }
    val countPrecipitationDuringDays =
        weathers.filter { weather -> weather._precipitationDuringDay == PRECIPITATION_YES }.size

    println()
    println("Общая сводка по температурам и осадкам!")
    println("Средние значения дневных температур: ${dailyTemperatures.average().roundToInt()} C")
    println("Средние значения ночных температур: ${nightTemperatures.average().roundToInt()} C")
    println("Количество дней с осадками: $countPrecipitationDuringDays")
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