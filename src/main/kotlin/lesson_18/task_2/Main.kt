package lesson_18.task_2

import kotlin.random.nextInt
import kotlin.random.Random

fun main() {
    val cubes = listOf(
        Cubic4Face(),
        Cubic6Face(),
        Cubic8Face(),
    )

    cubes.forEach { it.boneThrow() }
}

abstract class Cubic {
    protected abstract val diceN: Int
    fun boneThrow() {
        println("Бросаю $diceN-х кубик: ${Random.nextInt(1..diceN)} выпало")
    }
}

class Cubic4Face : Cubic() {
    override val diceN: Int = 4
}

class Cubic6Face : Cubic() {
    override val diceN: Int = 6
}

class Cubic8Face : Cubic() {
    override val diceN: Int = 8
}
