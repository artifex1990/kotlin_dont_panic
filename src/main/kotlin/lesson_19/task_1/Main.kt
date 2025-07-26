package lesson_19.task_1

fun main() {
    println("Список рыбок которые вы можете добавить в свой аквариум:")
    Fish.entries.forEach { fish -> println(getRussianNameForFish(fish)) }
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun getRussianNameForFish(fish: Fish): String = when(fish) {
        Fish.GUPPY -> "Гуппи"
        Fish.ANGELFISH -> "Скалярия"
        Fish.GOLDFISH -> "Золотая рыбка"
        Fish.SIAMESE_FIGHTING_FISH -> "Петушок"
}
