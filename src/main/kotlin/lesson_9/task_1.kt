package lesson_9

fun main() {
    print("Введите количество ингредиентов в рецепте: ")
    val countIngredient = readln().toInt()

    val recipes = mutableListOf<String>()

    for (i in 0 until countIngredient) {
        print("Введите название ингредиента ${i + 1}: ")
        recipes.add(readln())
    }

    println("В рецепте есть следующие ингредиенты:")
    println(recipes.joinToString("\n"))
}
