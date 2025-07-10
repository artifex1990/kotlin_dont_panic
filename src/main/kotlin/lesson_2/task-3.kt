package lesson_2

const val MINUTES_ON_HOUR = 60
const val SECONDS_ON_MINUTE = 60

fun main() {
    val hourDeparture = 9
    val minuteDeparture = 39
    val travelTimeMinute = 457

    val commonTravelMinute = hourDeparture * MINUTES_ON_HOUR + minuteDeparture + travelTimeMinute
    val hourArrival = commonTravelMinute / SECONDS_ON_MINUTE
    val minuteArrival = commonTravelMinute % SECONDS_ON_MINUTE

    println("Поезд прибудет в %02d:%02d".format(hourArrival, minuteArrival))
}