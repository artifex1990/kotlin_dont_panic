package lesson_19.task_4

fun main() {
    val tank = Tank()

    println("Пытаемся выстрелить не заряженным")
    tank.shoot()
    println()

    println("Заряжаем красным типом патронов")
    tank.chargeWeapons(Bullets.RED)
    tank.shoot()
    println()

    println("Заряжаем зеленным типом патронов")
    tank.chargeWeapons(Bullets.GREEN)
    tank.shoot()
    println()

    println("Заряжаем синим типом патронов")
    tank.chargeWeapons(Bullets.BLUE)
    tank.shoot()
}

class Tank {
    private var bullet: Bullets? = null

    fun chargeWeapons(newBullet: Bullets?) {
        bullet = newBullet
        if (bullet == null) {
            println("Я разряжен, не могу стрелять!")
            return
        }

        println("Оружие заряжено типом патронов ${bullet?.name}")
    }

    fun shoot() {
        if (bullet == null) {
            println("Я не заряжен, не могу стрелять!")
            return
        }

        println("Я стреляю ${bullet?.name} типом патронов, мой урон ${bullet?.power}")
    }

}

enum class Bullets(var power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}