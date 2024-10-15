fun main() {
    val lowerChar = readLine()!!.single()
    val upperChar = lowerChar.uppercaseChar()

    println("Символ в верхнем регистре: $upperChar")
    println("Код Unicode: ${upperChar.code}")
}
