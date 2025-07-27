package lesson_22.task_3

fun main() {
    val book = Book("1984", "Джордж Оруэлл", 1949)
    val (title, author, year) = book

    println("Название: $title")
    println("Автор: $author")
    println("Год издания: $year")
}

data class Book(
    val title: String,
    val author: String,
    val year: Int
)
