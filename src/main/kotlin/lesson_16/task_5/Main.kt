package lesson_16.task_5

const val MAX_HEALTH_PLAYER = 100
const val MAX_HIT_PLAYER = 15

fun main() {
    val player = Player("Герой", MAX_HEALTH_PLAYER, MAX_HIT_PLAYER)

    println("--- Начало боя ---")
    player.status()

    player.takeDamage(30)
    player.heal(10)
    player.takeDamage(50)
    player.takeDamage(40)
    player.heal(20)
    player.takeDamage(10)

    println("--- Конец боя ---")
    player.status()
}

class Player(
    private val name: String,
    private var health: Int,
    private var attackPower: Int
) {
    fun takeDamage(damage: Int) {
        if (health <= 0) {
            println("$name уже мёртв и не может получать урон!")
            return
        }

        health -= damage
        println("$name получает $damage урона. Осталось здоровья: $health")

        if (health <= 0) {
            die()
        }
    }

    fun heal(amount: Int) {
        if (health <= 0) {
            println("$name мёртв и не может быть вылечен!")
            return
        }

        health += amount
        if (health > MAX_HEALTH_PLAYER) {
            val differentHealth = health - MAX_HEALTH_PLAYER
            health = MAX_HEALTH_PLAYER
            println("$name восстанавливает $differentHealth здоровья. Теперь у него $health HP")
        } else {
            println("$name восстанавливает $amount здоровья. Теперь у него $health HP")
        }
    }

    private fun die() {
        health = 0
        attackPower = 0
        println("$name погибает!")
    }

    fun status() {
        println("[$name] HP: $health, Урон: $attackPower, Жив: ${if (health <= 0) "Нет" else "Да"}")
    }
}