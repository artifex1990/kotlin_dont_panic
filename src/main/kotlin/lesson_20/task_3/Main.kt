package lesson_20.task_3

fun main() {
    val player1 = Player("Игрок 1", false)
    val player2 = Player("Игрок 2", true)

    val healthRestoration: (player: Player) -> String = {
        player -> if (player.key) "${player.name} открыл дверь" else "Дверь заперта"
    }

    println(healthRestoration(player1))
    println(healthRestoration(player2))
}

class Player(
    val name: String,
    var key: Boolean
)
