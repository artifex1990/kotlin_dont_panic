package lesson_2

const val PERCENT_BASE = 100

fun main() {
    val buffPercent = 20
    val crystal = 7
    val ironStone = 11
    val bufCrystal = crystal * buffPercent / PERCENT_BASE
    val bufIronStone = ironStone * buffPercent / PERCENT_BASE

    println("Дополнительное количество кристалов с баффом $bufCrystal")
    println("Дополнительное количество железной руды с баффом $bufIronStone")
}