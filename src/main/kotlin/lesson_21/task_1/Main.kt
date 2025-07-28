package lesson_21.task_1

fun main() {
    println("Гласных букв в фразе \"Привет, мир\" -> ${"Привет, мир".vowelCount()}")
    println("Гласных букв в фразе \"Hello, World!\" -> ${"Hello, World!".vowelCount()}")
}

fun String.vowelCount() = this.count { vowel ->
    vowel.lowercaseChar() in setOf('a', 'e', 'i', 'o', 'u', 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')
}
