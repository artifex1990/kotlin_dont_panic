package lesson_22.task_5

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая к Солнцу звёздная система, состоящая из трёх звёзд",
        eventDateTime = "Постоянное местоположение",
        distanceFromEarth = 4.37
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val dateTime = alphaCentauri.component3()
    val distance = alphaCentauri.component4()

    println("""
        Данные о звездной системы Alpha Centauri
        Название: $name
        Описание: $description
        Время события: $dateTime
        Расстояние от Земли: $distance световых лет
    """.trimIndent())
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: String,
    val distanceFromEarth: Double,
)

