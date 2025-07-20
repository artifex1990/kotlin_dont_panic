package lesson_14.task_4

fun main() {
    val mars = Planet(
        name = "Mars",
        isAtmosphere = false,
        suitableLanding = true,
    )

    val fobos = Satellite(
        name = "Fobos",
        isAtmosphere = false,
        suitableLanding = false,
    )

    val deimos = Satellite(
        name = "Deimos",
        isAtmosphere = false,
        suitableLanding = false,
    )

    mars.addSatellite(fobos)
    mars.addSatellite(deimos)


    mars.showInfo()
}

abstract class CelestialBody(
    open val name: String,
    open val isAtmosphere: Boolean,
    open val suitableLanding: Boolean,
)

class Planet(
    override val name: String,
    override val isAtmosphere: Boolean,
    override val suitableLanding: Boolean,
    val listSatellite: MutableList<Satellite> = mutableListOf()
) : CelestialBody(
    name,
    isAtmosphere,
    suitableLanding,
) {
    fun addSatellite(satellite: Satellite) {
        listSatellite.add(satellite)
    }

    fun showInfo() {
        println("Название планеты: $name")
        println("Спутники планеты: ${listSatellite.joinToString(", ") { it.name }}")
    }
}

class Satellite(
    override val name: String,
    override val isAtmosphere: Boolean,
    override val suitableLanding: Boolean,
) : CelestialBody(
    name,
    isAtmosphere,
    suitableLanding,
)