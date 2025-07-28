package lesson_20.task_2

fun main() {
    val player = Player("player", 54, 100)

    val healthRestoration: (player: Player) -> Unit = { player ->
        println("Восстанавливаю ${player.maxHealth - player.currentHealth} здоровья")
        player.currentHealth = player.maxHealth
    }

    player.showInfo()
    healthRestoration(player)
    player.showInfo()
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
    fun showInfo() {
        println("Текущее здоровье $currentHealth")
    }
}
