package lesson_2

fun main() {
    val hourDeparture: Byte = 9
    val minuteDeparture: Byte = 39
    val travelTimeMinute: Int = 457
    val commonTravelMinute: Int = hourDeparture * 60 + minuteDeparture + travelTimeMinute
    val hourArrival: Byte = (commonTravelMinute / 60).toByte()
    val minuteArrival: Byte = (commonTravelMinute % 60).toByte()

    println("Поезд прибудет в %02d:%02d".format(hourArrival, minuteArrival))
}