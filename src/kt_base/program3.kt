fun main()
{
    print("Введите первый символ: ")
    val char1 = readLine()?.firstOrNull()

    print("Введите второй символ: ")
    val char2 = readLine()?.firstOrNull()

    if (char1 != null && char2 != null)
    {
        val unicode1 = char1.code
        val unicode2 = char2.code

        println("Unicode первого символа: $unicode1")
        println("Unicode второго символа: $unicode2")
        println("Разность кодов: ${unicode1 - unicode2}")
    }

    else
    {
        println("Некорректный ввод.")
    }
}
