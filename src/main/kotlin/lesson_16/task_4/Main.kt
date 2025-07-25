package lesson_16.task_4

const val ORDER_STATUS_LAYOUT = "layout"
const val ORDER_STATUS_OFFERED = "offered"

fun main() {
    val order = Order(1234)

    println("Статус заказа: ${order.getStatus()}")
    println("Меняем статус")
    order.requestStatusChange(ORDER_STATUS_OFFERED)
    println("Статус заказа: ${order.getStatus()}")
}

class Order(
    private val orderNumber: Int,
    private var status: String = ORDER_STATUS_LAYOUT,
) {
    fun getNumberOrder(): Int = orderNumber
    fun getStatus(): String = status

    fun requestStatusChange(newStatus: String) {
        println("Отправка запроса на изменение статуса заказа номер $orderNumber...")
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: String) {
        when(newStatus) {
            ORDER_STATUS_LAYOUT, ORDER_STATUS_OFFERED -> {
                status = newStatus
            }
            else -> println("Статус не найден!")
        }
    }
}
