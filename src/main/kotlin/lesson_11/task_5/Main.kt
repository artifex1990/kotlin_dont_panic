package lesson_11.task_5

fun main() {
    val forum = Forum()
        .createNewUser("Mikol")
        .createNewUser("Ivan")

    forum.createNewMessage(0)
    forum.createNewMessage(0)
    forum.createNewMessage(1)
    forum.createNewMessage(1)

    forum.printThread()
}

class Forum(
    val users: MutableList<ForumMember> = mutableListOf(),
    val messages: MutableList<ForumMessage> = mutableListOf()
) {
    fun createNewUser(userName: String) = apply {
        val nextUserId = if (users.isEmpty()) 0 else users.last().userId + 1
        val user = ForumMember(
            userId = nextUserId,
            userName = userName,
        )

        users.add(user)
    }

    fun createNewMessage(userId: Int) {
        if (users.any { user -> user.userId == userId }) {
            val message = ForumMessage(
                authorId = userId,
                message = "сообщение",
            )

            messages.add(message)
        }
    }

    fun printThread() {
        for (message in messages) {
            val user = users.find { it.userId == message.authorId }
            println("${user?.userName ?: "Неизвестный автор"}:${message.message}")
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)
