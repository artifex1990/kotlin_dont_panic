package lesson_22.task_1

fun main() {
    val regularBook1 = RegularBook("Война и мир", "Лев Толстой")
    val regularBook2 = RegularBook("Война и мир", "Лев Толстой")

    val dataBook1 = DataBook("1984", "Джордж Оруэлл")
    val dataBook2 = DataBook("1984", "Джордж Оруэлл")

    println("Сравнение RegularBook:")
    println(regularBook1 == regularBook2)  // false
    println(regularBook1 === regularBook2) // false

    println()

    println("\nСравнение DataBook:")
    println(dataBook1 == dataBook2)  // true
    println(dataBook1 === dataBook2) // false

    /* Разница в выводе объясняется тем, что:
       1. Для обычного класса (RegularBook):
          - Оператор '==' сравнивает ссылки (как '==='),
            поэтому разные объекты всегда считаются неравными

       2. Для data-класса (DataBook):
          - Оператор '==' сравнивает содержимое (поля title и author),
            поэтому объекты с одинаковыми полями считаются равными
          - '===' по-прежнему сравнивает ссылки и возвращает false
    */
}

class RegularBook(val title: String, val author: String)
data class DataBook(val title: String, val author: String)
