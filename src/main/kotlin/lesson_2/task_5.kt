package lesson_2

import kotlin.math.pow

fun main() {
    val clientContribution = 70000.0
    val interestRate = 0.167
    val depositTermYear = 20
    val compoundInterestFormula = clientContribution * (1 + interestRate).pow(depositTermYear)

    println("%.03f".format(compoundInterestFormula))
}