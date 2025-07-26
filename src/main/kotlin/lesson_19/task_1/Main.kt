package lesson_19.task_1

fun main() {
    println("Список рыбок которые вы можете добавить в свой аквариум:")
    Fish.entries.forEach { fish -> println(fish.nameFish) }
}

enum class Fish(var nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}
