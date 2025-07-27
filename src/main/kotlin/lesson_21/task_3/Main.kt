package lesson_21.task_3

fun main() {
    val player = Player("player", 54, 100)

    val healthRestoration: (player: Player) -> Unit = { player ->
        println("Восстанавливаю ${player.maxHealth - player.currentHealth} здоровья")
        player.currentHealth = player.maxHealth
    }

    player.showInfo()
    println("Полное здоровье у игрока: ${if (player.isHealthy()) "Да" else "Нет"}")
    healthRestoration(player)
    player.showInfo()
    println("Полное здоровье у игрока: ${if (player.isHealthy()) "Да" else "Нет"}")
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

fun Player.isHealthy(): Boolean = currentHealth == maxHealth
