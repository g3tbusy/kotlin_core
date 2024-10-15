fun main()
{
    print("Введите первое число: ")
    val a = readLine()?.toDoubleOrNull()

    print("Введите второе число: ")
    val b = readLine()?.toDoubleOrNull()

    print("Введите третье число: ")
    val c = readLine()?.toDoubleOrNull()

    if (a == null || b == null || c == null)
    {
        println("Ошибка ввода.")
    }

    else
    {
        val average = (a + b + c) / 3
        println("Среднее арифметическое: $average")
    }
}