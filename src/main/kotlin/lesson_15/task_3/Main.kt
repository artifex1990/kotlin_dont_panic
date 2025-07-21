package lesson_15.task_3

fun main() {
    val member = Member(0)
    val admin = Admin(1)

    println("Пользователь")
    member.readMessage()
    member.writeMessage()
    println()

    println("Администратор")
    admin.readMessage()
    admin.writeMessage()
    admin.deleteMessage()
}

abstract class User(
    open val userId: Int,
) {
    fun readMessage() {
        println("Читаю сообщения")
    }

    fun writeMessage() {
        println("Пишу сообщения")
    }
}

class Member(
    override val userId: Int
) : User(userId)

class Admin(
    override val userId: Int
) : User(userId) {
    fun deleteMessage() {
        println("Удаляю сообщение")
    }
}