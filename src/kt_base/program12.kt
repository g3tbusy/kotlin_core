fun main()
{
    println("Введите число n:")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 2)
    {
        println("Неверный ввод. Введите число больше 2.")
        return
    }

    for (i in 2 until n)
    {
        println(i * 2)
    }
}
