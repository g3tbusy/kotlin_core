fun main()
{
    println("Введите возраст:")
    val age = readLine()?.toIntOrNull()

    if (age == null || age < 0)
    {
        println("Введено некорректное значение")
    }
    else if (age >= 18)
    {
        println("Совершеннолетний")
    }
    else
    {
        println("Несовершеннолетний")
    }
}
