fun main()
{
    println("Введите строку (может быть null):")
    val input: String? = readLine()

    val length = input?.length

    if (length != null)
    {
        println("Длина строки: $length")
    }
    else
    {
        println("Строка была null.")
    }
}
