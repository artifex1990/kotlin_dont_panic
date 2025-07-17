package lesson_11.task_3

const val STATUS_TYPE_SPEAKING = 1
const val STATUS_TYPE_MIC_OFF = 2
const val STATUS_TYPE_MUTE_USER = 3

fun main() {
    val room = Room(
        cover = "cover:base64",
        name = "room 1",
    )

    val user = User(
        nick = "u1",
        avatar = "avatar:base64",
    )

    room.addParticipant(user)
    room.updateUserStatus(user.nick, STATUS_TYPE_MUTE_USER)

    room.showInfo()
}

class User(
    val avatar: String,
    val nick: String,
    var status: String = "",
) {
    fun showInfo() {
        println("Participant info:")
        println("avatar = $avatar")
        println("nick = $nick")
        println("status = $status")
    }

    fun setStatus(statusVariant: Int) {
        status = when (statusVariant) {
            STATUS_TYPE_SPEAKING -> "разговаривает"
            STATUS_TYPE_MIC_OFF -> "микрофон выключен"
            STATUS_TYPE_MUTE_USER -> "пользователь заглушен"
            else -> "не распознан"
        }
    }
}

class Room(
    val cover: String,
    val name: String,
    val listParticipants: MutableList<User> = mutableListOf<User>()
) {
    fun addParticipant(participant: User) {
        println("Участник добавлен!")
        listParticipants.add(participant)
    }

    fun updateUserStatus(nick: String, statusType: Int) {
        val user: User? = listParticipants.find { it.nick == nick }
        user?.setStatus(statusType)
    }

    fun showInfo() {
        println("Название комнаты: $name")
        println("Обложка комнаты: $cover")

        println("Список участников:")
        for (user in listParticipants) {
            user.showInfo()
            println()
        }
    }
}