package lesson_6

fun main() {
    println("Здравствуйте. Зарегистрируйтесь пожалуйста!")
    print("Ваш логин ")
    val userLogin = readln()

    print("Ваш пароль ")
    val userPassword = readln()

    println("Здравствуйте. Для доступа к системе требуется авторизация!")
    do {
        print("Введите логин ")
        val userLoginForCheck = readln()

        print("Введите пароль ")
        val userPasswordForCheck = readln()

        val isTrueUser = userLoginForCheck == userLogin || userPasswordForCheck == userPassword

        if (!isTrueUser) {
            println("Логин: $userLoginForCheck и пароль: $userPasswordForCheck - не верны!\nПовторите ввод!")
        }
    } while (!isTrueUser)

    println("Авторизация прошла успешно")
}