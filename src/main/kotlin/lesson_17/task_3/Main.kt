package lesson_17.task_3

fun main() {
    val folder1 = Folder(
        "folder 1",
        50,
        false
    )

    println("name: ${folder1.name}")
    println("count: ${folder1.fileCount}")
    println()

    val folder2 = Folder(
        "folder 2",
        40,
        true
    )

    println("name: ${folder2.name}")
    println("count: ${folder2.fileCount}")
}

class Folder(
    name: String,
    fileCount: Int,
    var secret: Boolean,
) {
    val name: String = name
        get() = if (secret) "скрытая папка" else field

    val fileCount: Int = fileCount
        get() = if (secret) 0 else field
}