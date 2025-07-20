package lesson_15.task_1

fun main() {
    println("Утка:")
    val duck = Duck()
    duck.move()
    duck.fly()
    duck.swim()
    println()

    println("Карп:")
    val crucian = Crucian()
    crucian.swim()
    println()

    println("Чайка:")
    val seagull = Seagull()
    seagull.fly()
}

interface Movable {
    fun move()
}

interface Flyable {
    fun fly()
}

interface Swimable {
    fun swim()
}

class Duck : Movable, Flyable, Swimable {
    override fun move() {
        println("Хожу")
    }

    override fun fly() {
        println("Летаю")
    }

    override fun swim() {
        println("Плаваю")
    }
}

class Crucian: Swimable {
    override fun swim() {
        println("Плаваю")
    }
}

class Seagull: Flyable {
    override fun fly() {
        println("Летаю")
    }
}
