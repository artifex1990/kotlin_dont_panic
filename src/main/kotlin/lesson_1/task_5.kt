package lesson_1

fun main() {
    val commonSecondsInSpace: Short = 6495
    val secondsOnMinute: Byte = 60
    val minutesOnHour: Byte = 60
    val hoursOnDay: Byte = 24
    val secondsInSpace: Byte = (commonSecondsInSpace % secondsOnMinute).toByte()
    val minutesInSpace: Byte = (commonSecondsInSpace / secondsOnMinute % minutesOnHour).toByte()
    val hoursInSpace: Byte = (commonSecondsInSpace / secondsOnMinute / minutesOnHour % hoursOnDay).toByte()

    println(
        "Время проведенное в космосе %02d:%02d:%02d".format(
            hoursInSpace, minutesInSpace, secondsInSpace
        )
    )
}
