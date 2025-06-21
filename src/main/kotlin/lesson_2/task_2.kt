package lesson_2

fun main() {
    val staffNumber = 50
    val staffSalary = 30000
    val traineeNumber = 30
    val traineeSalary = 20000

    val creditStaffSalary: Int = staffNumber * staffSalary
    val creditAllSalary: Int = creditStaffSalary + traineeSalary * traineeNumber
    val avgCommonSalary: Int = creditAllSalary / (staffNumber + traineeNumber)

    println("Расходы на выплату зарплаты постоянных сотрудников $creditStaffSalary рублей")
    println("Общие расходы по ЗП после прихода стажеров $creditAllSalary рублей")
    println("Средняя зарплата на сотрудника с учетом стажеров $avgCommonSalary рублей")
}