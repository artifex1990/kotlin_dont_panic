package lesson_19.task_5

const val MAX_PEOPLE = 5

enum class Gender(val id: Int) {
    MAN(1),
    WOMAN(2);

    companion object {
        fun fromId(id: Int?): Gender? {
            return entries.find { it.id == id }
        }
    }

}

class Person(
    val name: String,
    val gender: Gender
)

fun main() {
    val people = mutableListOf<Person>()
    var countPerson = 0

    println("""
        === Картотека ===
        Введите данные $MAX_PEOPLE человек
        Формат ввода: 
        1. Введите имя
        2. Выберите пол (${Gender.MAN.id} - MAN, ${Gender.WOMAN.id} - WOMAN)
        --------------------------
    """.trimIndent())

    while (countPerson < MAX_PEOPLE) {
        print("${countPerson + 1}. Введите имя: ")
        val name = readln().trim()

        if (name.isEmpty()) {
            println("Имя не может быть пустым!")
            continue
        }

        print("Выберите пол (${Gender.MAN.id} - MAN, ${Gender.WOMAN.id} - WOMAN): ")
        val genderType = readln().toIntOrNull()
        val gender = Gender.fromId(genderType)

        if (gender == null) {
            println("Ошибка: введите ${Gender.MAN.id} для MAN или ${Gender.WOMAN.id} для WOMAN")
            continue
        }

        people.add(Person(name, gender))
        countPerson++
    }

    println("=== Список людей в картотеке ===")
    people.forEachIndexed { index, person ->
        println("${index + 1}. ${person.name} (${person.gender})")
    }
}
