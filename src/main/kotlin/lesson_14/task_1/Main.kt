package lesson_14.task_1

fun main() {
    Liner()
    Cargo()
    Icebreaker()
}

open class Liner(
    open val maxSpeed: Int = 30,
    open val cargoCapacity: Int = 50,
    open val passengerCapacity: Int = 500,
)

class Cargo(
    override val maxSpeed: Int = 20,
    override val cargoCapacity: Int = 80,
    override val passengerCapacity: Int = 200,
) : Liner(maxSpeed, cargoCapacity, passengerCapacity)

class Icebreaker(
    override val maxSpeed: Int = 10,
    override val cargoCapacity: Int = 30,
    override val passengerCapacity: Int = 200,
) : Liner(maxSpeed, cargoCapacity, passengerCapacity) {
    fun iceBreak() {
        println("Ломаю лед")
    }
}

