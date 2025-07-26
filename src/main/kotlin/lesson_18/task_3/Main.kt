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
    abstract fun eat()
}

class Cat() : Animal() {
    override fun eat() {
        println("Кошка - рыбу")
    }
}

class Dog() : Animal() {
    override fun eat() {
        println("Собака - кости")
    }
}

class Fox() : Animal() {
    override fun eat() {
        println("Лиса - ягоды")
    }
}