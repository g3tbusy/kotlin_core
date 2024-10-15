fun main()
{
    print("Введите символ: ")
    val input = readLine()?.firstOrNull()

    if (input != null)
    {
        val isLetter = input.isLetter()
        println("Это буква: $isLetter")
    }

    else
    {
        println("Некорректный ввод.")
    }
}
