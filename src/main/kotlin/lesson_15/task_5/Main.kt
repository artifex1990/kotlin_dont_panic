package lesson_15.task_5

fun main() {
    val truck = TruckVehicle()
    val car1 = CarVehicle()
    val car2 = CarVehicle()

    truck.loadPassengers(1)
    truck.loadCargo(2)
    truck.move()
    truck.unloadCargo(2)
    truck.unloadPassengers(1)

    car1.loadPassengers(3)
    car1.move()
    car1.unloadPassengers(3)

    car2.loadPassengers(2)
    car2.move()
    car2.unloadPassengers(2)
}


interface Movable {
    fun move() {
        println("Едем!")
    }
}

interface PassengerTransport {
    fun loadPassengers(count: Int): Boolean
    fun unloadPassengers(count: Int): Boolean
}

interface CargoTransport {
    fun loadCargo(weight: Int): Boolean
    fun unloadCargo(weight: Int): Boolean
}

class TruckVehicle(
    val maxPassengers: Int = 1,
    var currentPassengers: Int = 0,
    val maxCargo: Int = 2,
    var currentCargo: Int = 0,
) : Movable, PassengerTransport, CargoTransport {
    override fun loadPassengers(count: Int): Boolean {
        return if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Загружено $count пассажиров в грузовик")
            true
        } else false
    }

    override fun unloadPassengers(count: Int): Boolean {
        return if (currentPassengers >= count) {
            currentPassengers -= count
            println("Выгружено $count пассажиров из грузовика")
            true
        } else false
    }

    override fun loadCargo(weight: Int): Boolean {
        return if (currentCargo + weight <= maxCargo) {
            currentCargo += weight
            println("Загружено $weight т груза в грузовик")
            true
        } else false
    }

    override fun unloadCargo(weight: Int): Boolean {
        return if (currentCargo >= weight) {
            currentCargo -= weight
            println("Выгружено $weight т груза из грузовика")
            true
        } else false
    }
}

class CarVehicle(
    val maxPassengers: Int = 3,
    var currentPassengers: Int = 0,
) : Movable, PassengerTransport {
    override fun loadPassengers(count: Int): Boolean {
        return if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Загружено $count пассажиров в легковушку")
            true
        } else false
    }

    override fun unloadPassengers(count: Int): Boolean {
        return if (currentPassengers >= count) {
            currentPassengers -= count
            println("Выгружено $count пассажиров из легковушки")
            true
        } else false
    }
}
