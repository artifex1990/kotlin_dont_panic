package lesson_18.task_1

fun main() {
    val orders = listOf(
        OrderItem(1213, "Наушники"),
        OrderItems(4325, listOf("Мембрана", "Силикон", "Флюс"))
    )

    orders.forEach { it.showItem() }
}

abstract class Order(
    protected open val orderNumber: Int,
) {
    abstract fun showItem()
}

class OrderItem(
    override val orderNumber: Int,
    val orderItem: String,
) : Order(orderNumber) {
    override fun showItem() {
        println("Заказан товар: $orderItem")
    }
}

class OrderItems(
    override val orderNumber: Int,
    val orderItems: List<String>,
) : Order(orderNumber) {
    override fun showItem() {
        println("Заказаны следующие товары: ${orderItems.joinToString(", ")}")
    }
}