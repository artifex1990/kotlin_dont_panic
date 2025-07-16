package lesson_9

const val ANSWER_YES = "да"

fun main() {
    val recipes = mutableListOf("salt" , "sugar", "carrot")
    println("В рецепте есть базовые ингредиенты: ${recipes.joinToString(", ")}")

    println("Желаете добавить еще?")
    val answerUser = readln()

    if (answerUser.equals(ANSWER_YES, true)) {
        println("Какой ингредиент вы хотите добавить?")
        recipes.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${recipes.joinToString(", ")}")
    }
}
