package lesson_4

const val HAS_DAMAGE = true
const val WEATHER_GOOD = true

fun main() {
    val minCrewSize = 55
    val maxCrewSize = 70
    val minFoodBoxes = 50

    println("Введите данные для проверки возможности отплытия:")

    print("Наличие повреждений корпуса (true/false): ")
    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val crewSize = readln().toInt()

    print("Количество ящиков с провизией: ")
    val foodBoxes = readln().toInt()

    print("Благоприятность метеоусловий (true/false): ")
    val isWeatherGood = readln().toBoolean()

    val canSail = (hasDamage == !HAS_DAMAGE
            && crewSize in minCrewSize..maxCrewSize
            && foodBoxes > minFoodBoxes) ||
            (hasDamage == HAS_DAMAGE
                    && crewSize == maxCrewSize
                    && isWeatherGood == WEATHER_GOOD
                    && foodBoxes >= minFoodBoxes)

    println("Корабль может отправиться в плавание? $canSail")
}
