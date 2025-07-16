package lesson_10

const val CORRECT_LOGIN = "admin"
const val CORRECT_PASSWORD = "qwerty123"
const val MAX_KEY = 32

fun main() {
    println("Добро пожаловать в интернет-магазин!")

    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    val token = authorize(login, password)

    if (token != null) {
        println("Авторизация успешна! Ваш токен: $token")
        val cart = getShoppingCart(token)
        println("Ваша корзина: ${cart.joinToString(", ")}")
    } else {
        println("Ошибка авторизации: неверный логин или пароль")
    }
}

fun authorize(login: String, password: String): String? =
    if (login == CORRECT_LOGIN && password == CORRECT_PASSWORD) generateToken() else null

fun generateToken(): String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..MAX_KEY)
        .map { charset.random() }
        .joinToString("")
}

fun getShoppingCart(token: String): List<String> = listOf(
    "iPhone 15 Pro",
    "MacBook Pro 14",
    "AirPods Pro 2",
    "Apple Watch Ultra 2"
)
