fun main()
{
    println("Введите возраст:")
    val age = readLine()?.toIntOrNull()

    if (age == null || age < 0)
    {
        println("Некорректный возраст")
    }
    else
    {
        when (age)
        {
            in 0..12 -> println("Ребёнок")
            in 13..17 -> println("Подросток")
            in 18..64 -> println("Взрослый")
            in 65..Int.MAX_VALUE -> println("Пожилой")
            else -> println("Некорректный возраст")
        }
    }
}
