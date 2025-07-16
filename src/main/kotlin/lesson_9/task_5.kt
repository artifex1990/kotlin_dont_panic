package lesson_9

const val MAX_INGREDIENTS = 5

fun main() {
    val recipes = mutableSetOf<String>()

    println("Введите $MAX_INGREDIENTS ингредиентов")
    for (i in 0 until MAX_INGREDIENTS) {
        print("Введите название ингредиента ${i + 1}: ")
        recipes.add(readln())
    }

    val listIngredients = recipes.sorted().joinToString(", ").replaceFirstChar { it.uppercase() }

    println("Список ингредиентов в рецепте: $listIngredients")
}
