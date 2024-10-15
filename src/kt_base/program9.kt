fun main()
{
    println("Введите число:")
    val number = readLine()?.toIntOrNull()

    if (number == null)
    {
        println("Введено некорректное значение")
    }
    else
    {
        if (number % 2 == 0)
        {
            println("Число $number является чётным")
        }
        else
        {
            println("Число $number является нечётным")
        }
    }
}
