package lesson_8

fun main() {
    print("Введите количество ингредиентов в рецепте: ")
    val countIngredient = readln().toInt()

    val recipes = Array(countIngredient) { "" }

    for (i in 0 until countIngredient) {
        print("Введите название ингредиента ${i + 1}: ")
        recipes[i] = readln()
    }

    println("Список ингредиентов: ${recipes.joinToString(", ")}")
}
