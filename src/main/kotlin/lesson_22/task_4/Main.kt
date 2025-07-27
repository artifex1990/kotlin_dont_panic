package lesson_22.task_4

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

class MainScreenViewModel {
    private var currentState = MainScreenState()

    fun loadData() {
        currentState = MainScreenState(
            data = null,
            isLoading = false
        )
        println("Состояние 1: $currentState")

        currentState = currentState.copy(isLoading = true)
        println("Состояние 2: $currentState")

        currentState = currentState.copy(
            data = "Данные успешно загружены",
            isLoading = false
        )
        println("Состояние 3: $currentState")
    }

    private data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false
    )
}
