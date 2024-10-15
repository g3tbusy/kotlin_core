fun main()
{
    println("Введите число для поиска:")
    val targetNumber = readLine()?.toIntOrNull() ?: return

    println("Введите количество элементов в массиве:")
    val arraySize = readLine()?.toIntOrNull() ?: return

    val array = IntArray(arraySize)
    for (i in 0 until arraySize)
    {
        println("Введите элемент массива №${i + 1}:")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }

    val containsNumber = targetNumber in array

    println(containsNumber)
}
