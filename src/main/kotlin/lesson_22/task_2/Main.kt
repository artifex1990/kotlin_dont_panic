package lesson_22.task_2

fun main() {
    val regularBook = RegularBook("Преступление и наказание", "Фёдор Достоевский")
    val dataBook = DataBook("Мастер и Маргарита", "Михаил Булгаков")

    println("Вывод RegularBook: $regularBook")
    println("Вывод DataBook: $dataBook")

    /* Разница в выводе объясняется тем, что:
       1. Для обычного класса (RegularBook) выводится стандартный toString(),
          который возвращает строку с именем класса и хэш-кодом объекта
          Формат: ClassName@hexHashCode

       2. Для data-класса (DataBook) автоматически генерируется toString(),
          который показывает значения всех свойств класса
          Формат: ClassName(property1=value1, property2=value2)
    */
}

class RegularBook(val title: String, val author: String)
data class DataBook(val title: String, val author: String)
