package lesson_21.task_4

import java.io.File

fun main() {
    val file = File("words.txt")

    file.prependWord("new word 1")
    file.prependWord("new word 2")
    file.prependWord("new word 3")
}

fun File.prependWord(word: String) {
    val lowerWord = word.lowercase() + "\n"
    val existingContent = if (this.exists()) this.readText() else ""

    this.writeText(lowerWord + existingContent)
}