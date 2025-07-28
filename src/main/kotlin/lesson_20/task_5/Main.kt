package lesson_20.task_5

fun main() {
    val robot = Robot()

    val reverseWordsModifier: (String) -> String = { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    robot.say()
    robot.setModifier(reverseWordsModifier)
    robot.say()
}

class Robot {
    private val phrases = listOf(
        "Я устал от программирования!",
        "Мир тлен!",
        "В слове п*здец - что-то есть!",
        "Опять бэки завалили прод!",
        "Фронты до сей поры думают, что они программисты!"
    )

    private var modifier: (String) -> String = { it }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say() {
        val randomPhrase = phrases.random()
        println(modifier(randomPhrase))
    }
}
