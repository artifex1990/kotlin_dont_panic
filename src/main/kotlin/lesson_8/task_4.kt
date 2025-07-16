package lesson_8

fun main() {
    val recipes = arrayOf("sugar", "salt", "flour", "baking powder", "milk", "oil", "egg")

    println("Список ингредиентов")
    println(recipes.joinToString(", "))

    print("Напишите какой ингредиент вы хотите заменить: ")
    val userChoiceIngredient = readln()
    val indexForChangeIngredient = recipes.indexOf(userChoiceIngredient)

    if (indexForChangeIngredient != -1) {
        print("Напишите чем замените ингредиент $userChoiceIngredient: ")
        val userChangeIngredient = readln()

        recipes[indexForChangeIngredient] = userChangeIngredient

        println("Готово! Вы сохранили следующий список: ${recipes.joinToString(", ")}")
    } else {
        println("Такого ингредиента $userChoiceIngredient в списке нет!")
    }
}
