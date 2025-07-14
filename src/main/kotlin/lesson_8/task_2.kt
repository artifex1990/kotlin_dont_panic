package lesson_8

fun main() {
    val recipes = arrayOf("sugar", "salt", "flour", "baking powder", "milk", "oil", "egg")

    print("Напишите о каком ингредиенте вы хотите получить информацию: ")
    val userIngredient = readln()

    for (recipe in recipes) {
        if (userIngredient == recipe) {
            println("Ингредиент $recipe в рецепте есть!")
            return
        }
    }

    println("Такого ингредиента $userIngredient в рецепте нет!")
}
