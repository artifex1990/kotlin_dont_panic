package lesson_17.task_2

fun main() {
    val ship = Ship("Ship_1", 15.6, "SPB")
    ship.name = "Ship_2"
    println(ship.name)
}

class Ship(
    name: String,
    var average: Double,
    var port: String,
) {
    var name: String = name
        set(value) {
            if (field == "") {
                field = value
            } else {
                println("Поле name нельзя менять!")
            }
        }
}