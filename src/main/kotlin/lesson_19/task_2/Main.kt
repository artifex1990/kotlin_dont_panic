package lesson_19.task_2

fun main() {
    val product1 = Product(1, "Футболка", ProductCategories.CLOTHING)
    val product2 = Product(2, "Ручка", ProductCategories.STATIONERY)
    val product3 = Product(3, "Наушники", ProductCategories.OTHER)

    product1.printInfo()
    product2.printInfo()
    product3.printInfo()
}

class Product(
    val id: Int,
    val name: String,
    var productCategory: ProductCategories,
) {
    fun printInfo() {
        println("""
            Товар: $name
            ID: $id
            Категория: ${productCategory.getCategoryName()}
            ----------------------
        """.trimIndent())
    }
}

enum class ProductCategories(var categoryName: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHER("Разное");

    fun getCategoryName(): String = categoryName
}