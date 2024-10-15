fun main()
{
    println("Введите число от 1 до 7:")
    val dayNumber = readLine()?.toIntOrNull()

    if (dayNumber == null || dayNumber !in 1..7)
    {
        println("Неверный ввод. Введите число от 1 до 7.")
        return
    }

    val dayOfWeek = when (dayNumber)
    {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> "Неверный день"
    }

    // Выводим результат
    println("День недели: $dayOfWeek")
}
