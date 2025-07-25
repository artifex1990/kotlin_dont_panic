package lesson_18.task_3

fun main() {
    val animals = listOf<Animal>(
        Cat(),
        Dog(),
        Fox(),
    )

    animals.forEach { it.eat() }
}

abstract class Animal {
    abstract val name: String

    abstract fun eat()
    abstract fun sleep()
}

class Cat() : Animal() {
    override val name: String = "Кошка"

    override fun eat() {
        println("$name - рыбу")
    }

    override fun sleep() {
        println("$name - спит")
    }
}

class Dog() : Animal() {
    override val name: String = "Собака"

    override fun eat() {
        println("$name - рыбу")
    }

    override fun sleep() {
        println("$name - спит")
    }
}

class Fox() : Animal() {
    override val name: String = "Лиса"
    override fun eat() {
        println("$name - рыбу")
    }

    override fun sleep() {
        println("$name - спит")
    }
}