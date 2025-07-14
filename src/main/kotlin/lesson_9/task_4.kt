package lesson_9

fun main() {
    val separate = ", "
    println("Введите 5 ингредиентов, разделя \", \" запятая с пробелом")
    val userIngredients = readln()

    val recipeSorted = userIngredients.split(separate).sorted()

    println(recipeSorted.joinToString(separate))
}
