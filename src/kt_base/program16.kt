fun main()
{
    println("Введите длину списка:")
    val listSize = readLine()?.toIntOrNull() ?: return

    val list = mutableListOf<Int>()

    for (i in 0 until listSize)
    {
        println("Введите элемент списка №${i + 1}:")
        val element = readLine()?.toIntOrNull() ?: 0
        if (element !in list)
        {
            list.add(element)
        }
    }

    println("Множество уникальных элементов в оригинальном порядке:")
    println(list.joinToString(", "))
}
