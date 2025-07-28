package lesson_18.task_1

fun main() {
    val orderItem = Order(12354)
    val orderItems = Order(54641)

    orderItem.showItem("Наушники")
    orderItems.showItem(listOf("Принтер", "Сканер", "Плоттер"))
}

class Order(
    val orderNumber: Int,
) {
    fun showItem(orderItem: String) {
        println("Заказ № $orderNumber. Заказан товар: $orderItem")
    }

    fun showItem(orderItems: List<String>) {
        println("Заказ № $orderNumber. Заказаны следующие товары: ${orderItems.joinToString(", ")}")
    }
}