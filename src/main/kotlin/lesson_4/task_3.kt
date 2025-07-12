package lesson_4

fun main() {
    val trueConditionsSunnyWeather = true
    val trueConditionOpenAwning = false
    val trueConditionRelativeHumidity = 20
    val trueConditionCurrentTimeYear = "не зима"

    val tryConditionsSunnyWeather = true
    val tryConditionOpenAwning = true
    val tryConditionRelativeHumidity = 20
    val tryConditionCurrentTimeYear = "зима"

    val isTrueConditions =
        trueConditionsSunnyWeather == tryConditionsSunnyWeather
                && trueConditionOpenAwning == tryConditionOpenAwning
                && trueConditionRelativeHumidity == tryConditionRelativeHumidity
                && trueConditionCurrentTimeYear == tryConditionCurrentTimeYear

    println("Благоприятные ли условия сейчас для роста бобовых? $isTrueConditions")
}
