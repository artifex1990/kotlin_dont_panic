package lesson_2

import kotlin.math.pow

const val PERCENT_BASE = 100

fun main() {
    val clientContribution = 70000.0
    val interestRate = 16.7
    val depositTermYear = 20

    val compoundInterestFormula = clientContribution * (1 + interestRate / PERCENT_BASE).pow(depositTermYear)

    println("%.03f".format(compoundInterestFormula))
}