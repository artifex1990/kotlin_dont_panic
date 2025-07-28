package lesson_20.task_4

fun main() {
    val items = listOf("Кнопка", "Меню", "Слайдер", "Чекбокс", "Переключатель")

    val printActions = items.map { item ->
        { println("Нажат элемент [$item]") }
    }

    printActions.forEachIndexed { index, action ->
        if (index % 2 == 1) {
            action()
        }
    }
}
