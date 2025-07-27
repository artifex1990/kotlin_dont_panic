package lesson_19.task_3

fun main() {
    val spaceship = Spaceship()

    spaceship.takeOff()
    spaceship.land()
    spaceship.evadeAsteroid()
}

class Spaceship {
    // TODO: требуется добавить логику для проверки взлетевшего корабля
    fun takeOff() {
        println("Взлетаю")
    }

    // TODO: нужна логика для проверки стоящих кораблей
    fun land() {
        println("Приземляюсь")
    }

    fun evadeAsteroid() {
        TODO("Необходимо реализовать метод для отстреливания астеройдов!")
    }
}