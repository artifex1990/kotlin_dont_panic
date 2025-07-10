package lesson_4

const val MIN_AVERAGE_WEIGHT_IN_KG = 35
const val MAX_AVERAGE_WEIGHT_IN_KG = 100
const val MIN_AVERAGE_VOLUME_IN_LITERS = 0
const val MAX_AVERAGE_VOLUME_IN_LITERS = 100

fun main() {
    var weightInKg = 20
    var volumeInLiters = 80

    println(
        "Груз с весом $weightInKg кг и объемом $volumeInLiters л соответствует категории 'Average': "+
        (MIN_AVERAGE_WEIGHT_IN_KG < weightInKg && weightInKg <= MAX_AVERAGE_WEIGHT_IN_KG &&
                MIN_AVERAGE_VOLUME_IN_LITERS < volumeInLiters && volumeInLiters < MAX_AVERAGE_VOLUME_IN_LITERS)
    )

    weightInKg = 50
    volumeInLiters = 100

    println(
        "Груз с весом $weightInKg кг и объемом $volumeInLiters л соответствует категории 'Average': "+
        (MIN_AVERAGE_WEIGHT_IN_KG < weightInKg && weightInKg <= MAX_AVERAGE_WEIGHT_IN_KG &&
                MIN_AVERAGE_VOLUME_IN_LITERS < volumeInLiters && volumeInLiters < MAX_AVERAGE_VOLUME_IN_LITERS)
    )
}
