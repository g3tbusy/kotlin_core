fun main()
{
    println("Введите строку:")
    val input = readLine() ?: ""

    if (input.length >= 2)
    {
        val firstTwoChars = input.substring(0, 2)
        val remainingString = input.substring(2)

        val result = remainingString + firstTwoChars

        println("Результат: $result")
    }
    else
    {
        println("Строка должна содержать хотя бы два символа.")
    }
}
