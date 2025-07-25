package lesson_17.task_1

fun main() {
}

class QuizItem(
    query: String,
    answer: String,
) {
    val query: String = query
        get() = field

    var answer: String = answer
        get() = field
        set(value) { field = value }
}