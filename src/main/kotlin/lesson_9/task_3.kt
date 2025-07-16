package lesson_9

fun main() {
    var recipe = listOf(2, 50, 15)

    print("Количество порций ")
    val numberServings = readln().toInt()

    recipe = recipe.map { it * numberServings }

    println(
        "На $numberServings порций вам понадобится: " +
                "Яиц – ${recipe[0]} шт., молока – ${recipe[1]} мл, сливочного масла – ${recipe[2]} гр."
    )
}
