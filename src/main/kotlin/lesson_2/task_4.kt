package lesson_2

fun main() {
    val buf = 0.2
    val crystal = 7
    val ironStone = 11
    val bufCrystal = crystal * buf
    val bufIronStone = ironStone * buf

    println("Дополнительное количество кристалов с баффом %.0f".format(bufCrystal))
    println("Дополнительное количество железной руды с баффом %.0f".format(bufIronStone))
}