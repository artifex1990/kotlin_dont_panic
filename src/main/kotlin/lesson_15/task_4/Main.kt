package lesson_15.task_4

fun main() {
    val guitar = Instrument(
        "Электрогитара Fender",
        5,
        "Гитара"
    )
    val strings = Accessory(
        "Струны для гитары",
        20,
        listOf(
            "Электрогитара Fender"
        )
    )
    val drumSticks = Accessory(
        "Барабанные палочки",
        15,
        listOf("Ударная установка")
    )

    guitar.showInfo()
    strings.showInfo()
    drumSticks.showInfo()

    guitar.searchProducts()
    println("Найдены: ${strings.name}")
}

abstract class Product(
    open val name: String,
    open val stockQuantity: Int
) {
    fun showInfo() {
        println("$name (в наличии: $stockQuantity шт.)")
    }
}

interface Searchable {
    fun searchProducts()
}

class Instrument(
    override val name: String,
    override val stockQuantity: Int,
    val type: String
) : Product(name, stockQuantity), Searchable {

    override fun searchProducts() {
        println("Выполняется поиск комплектующих для $name")
    }
}

class Accessory(
    override val name: String,
    override val stockQuantity: Int,
    val compatibleInstruments: List<String>
) : Product(name, stockQuantity)

