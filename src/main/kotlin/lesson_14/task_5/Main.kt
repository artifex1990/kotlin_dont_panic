package lesson_14.task_5

fun main() {
    val chat = Chat()
    val messageId1 = chat.addMessage("Hello 1", "Author 1")
    chat.addThreadMessage(messageId1, "Sub message 1 hello!!!", "Author 2")
    chat.addThreadMessage(messageId1, "Sub message 2 hello!!!", "Author 2")
    chat.addThreadMessage(messageId1, "Sub message 3 hello!!!", "Author 2")
    chat.addThreadMessage(messageId1, "Sub message 4 hello!!!", "Author 2")

    val messageId2 = chat.addMessage("Hello 2", "Author 2")
    chat.addThreadMessage(messageId2, "Sub message 1 hello!!!", "Author 1")
    chat.addThreadMessage(messageId2, "Sub message 2 hello!!!", "Author 1")
    chat.addThreadMessage(messageId2, "Sub message 3 hello!!!", "Author 1")

    chat.printChat()
}

class Chat(
    val messages: MutableList<Message> = mutableListOf()
) {
    fun addMessage(text: String, author: String): Int {
        val id = nextId()
        messages.add(Message(id, text, author))

        return id;
    }

    fun addThreadMessage(parentId: Int, text: String, author: String) {
        messages.add(ChildMessage(nextId(), text, author, parentId))
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { message ->
            when (message) {
                is ChildMessage -> message.parentMessageId
                else -> message.id
            }
        }

        messages.filter {it !is ChildMessage}.forEach { parent ->
            println(parent.text)

            groupedMessages[parent.id]?.filterIsInstance<ChildMessage>()?.forEach { child ->
                println("\t${child.text}")
            }
        }
    }

    fun nextId(): Int = if (messages.isEmpty()) 0 else messages.size + 1
}

open class Message(
    open val id: Int,
    open val text: String,
    open val author: String,
)

class ChildMessage(
    override val id: Int,
    override val text: String,
    override val author: String,
    val parentMessageId: Int,
) : Message(id, text, author)