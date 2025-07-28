package lesson_20.task_1

fun main() {
    val userName: String = "user"
    val lambdaHappyNewYear: () -> Unit = {
        "С наступающим Новым Годом, $userName!"
    }

    println(lambdaHappyNewYear())
}

