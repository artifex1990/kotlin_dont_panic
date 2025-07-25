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
    abstract fun boneThrow()
}

class Cubic4Face : Cubic() {
    override fun boneThrow() {
        println("Бросаю 4-х кубик: ${Random.nextInt(1..4)} выпало")
    }
}

class Cubic6Face : Cubic() {
    override fun boneThrow() {
        println("Бросаю 6-х кубик: ${Random.nextInt(1..6)} выпало")
    }
}

class Cubic8Face : Cubic() {
    override fun boneThrow() {
        println("Бросаю 8-х кубик: ${Random.nextInt(1..8)} выпало")
    }
}