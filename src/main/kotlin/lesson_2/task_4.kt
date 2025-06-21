package lesson_2

fun main() {
    val buf: Float = 0.2f
    val crystal: Int = 7
    val ironStone: Int = 11
    val bufCrystal: Int = (crystal * buf).toInt()
    val bufIronStone: Int = (ironStone * buf).toInt()

    println("Дополнительное количество кристалов с баффом $bufCrystal")
    println("Дополнительное количество железной руды с баффом $bufIronStone")
}