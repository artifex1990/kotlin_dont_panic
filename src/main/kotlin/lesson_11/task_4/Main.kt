package lesson_11.task_4

fun main() {
    val categoryHamburgers = CategoryRecipe(
        "Hamburgers"
    )

    val recipeSimpleHamburger = Recipe(
        "Simple Hamburger",
    )

    val ingredientEgg = Ingredient("Egg")
    val ingredientSugar = Ingredient("Sugar")
    val ingredientFlour = Ingredient("Flour")
    val ingredientOil = Ingredient("Oil")
    val ingredientQuark = Ingredient("Quark")

    recipeSimpleHamburger.addPositions(
        mutableListOf(
            Triple(ingredientEgg, 2, "piece"),
            Triple(ingredientFlour, 6, "tablespoon"),
            Triple(ingredientOil, 5, "tablespoon"),
            Triple(ingredientSugar, 2, "tablespoon"),
            Triple(ingredientQuark, 350, "gram"),
        )
    )

    categoryHamburgers.addRecipe(recipeSimpleHamburger)

    recipeSimpleHamburger.showInfo()
}

class CategoryRecipe(
    val name: String,
    val listRecipes: MutableList<Recipe> = mutableListOf(),
) {
    fun addRecipe(recipe: Recipe) {
        listRecipes.add(recipe)
    }
}

class Recipe(
    val name: String,
    val listPosition: MutableList<Triple<Ingredient, Int, String>> = mutableListOf(),
) {
    fun addPositions(positions: MutableList<Triple<Ingredient, Int, String>>) {
        listPosition.addAll(positions)
    }

    fun showInfo() {
        println("Название рецепта: $name")
        println("Ингридиенты:")
        for (position in listPosition) {
            val ingredient = position.first
            val amount = position.second
            val unit = position.third
            println("${ingredient.name}: $amount $unit")
        }
    }
}

class Ingredient(
    val name: String,
)
