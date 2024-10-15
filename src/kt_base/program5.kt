fun main()
{
    val strings = mutableListOf<String>()

    for (i in 1..5)
    {
        println("Введите строку $i:")
        val input = readLine() ?: ""
        strings.add(input)
    }

    val result = strings.joinToString(separator = "")

    println("Объединённая строка: $result")
}
