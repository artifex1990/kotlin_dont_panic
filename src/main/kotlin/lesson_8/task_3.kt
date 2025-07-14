package lesson_8

fun main() {
    val recipes = arrayOf("sugar", "salt", "flour", "baking powder", "milk", "oil", "egg")

    print("Напишите о каком ингредиенте вы хотите получить информацию: ")
    val userIngredient = readln()

    if (recipes.indexOf(userIngredient) != -1) {
        println("Ингредиент $userIngredient в рецепте есть!")
    } else {
        println("Такого ингредиента $userIngredient в рецепте нет!")
    }
}
