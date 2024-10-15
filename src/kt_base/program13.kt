fun main()
{
    println("Введите положительное число для обратного отсчета:")
    val number = readLine()?.toIntOrNull()

    if (number == null || number <= 0)
    {
        println("Неверный ввод. Введите положительное целое число.")
        return
    }

    for (i in number downTo 1)
    {
        println(i)
    }

    println("Старт!")
}
