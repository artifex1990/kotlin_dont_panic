package lesson_14.task_2

fun main() {
    println("Liner")
    val liner = Liner()
    liner.showInfo()
    liner.loadOnShip()
    println()

    println("Cargo")
    val cargo = Cargo()
    cargo.showInfo()
    cargo.loadOnShip()
    println()

    println("Icebreaker")
    val icebreaker = Icebreaker()
    icebreaker.showInfo()
    icebreaker.loadOnShip()
}

open class Liner(
    open val maxSpeed: Int = 30,
    open val cargoCapacity: Int = 50,
    open val passengerCapacity: Int = 500,
) {
    fun showInfo() {
        println("Максимальная скорость: $maxSpeed")
        println("Грузоподъемность: $cargoCapacity")
        println("Вместимость людей: $passengerCapacity")
    }

    open fun loadOnShip() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class Cargo(
    override val maxSpeed: Int = 20,
    override val cargoCapacity: Int = 80,
    override val passengerCapacity: Int = 200,
) : Liner(maxSpeed, cargoCapacity, passengerCapacity) {
    override fun loadOnShip() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker(
    override val maxSpeed: Int = 10,
    override val cargoCapacity: Int = 30,
    override val passengerCapacity: Int = 200,
) : Liner(maxSpeed, cargoCapacity, passengerCapacity) {
    fun iceBreak() {
        println("Ломаю лед")
    }

    override fun loadOnShip() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}
