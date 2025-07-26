package lesson_17.task_4

fun main() {
    val post = Post(
        1234,
        "SPB"
    )

    println("Post ${post.postNumber}, delivery: ${post.postPlace}")
    println("Post counter: ${post.getCounter()}")
    println()

    post.postPlace = "MSK"
    println("Post ${post.postNumber}, delivery: ${post.postPlace}")
    println("Post counter: ${post.getCounter()}")
}

class Post(
    val postNumber: Int,
    postPlace: String,
) {
    private var counter: Int = 0
    var postPlace: String = postPlace
        set(value) {
            if (field != value) {
                counter++
                field = value
            }
        }

    fun getCounter(): Int = counter
}