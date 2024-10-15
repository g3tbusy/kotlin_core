fun main()
{
    println("Введите длину массива:")
    val arraySize = readLine()?.toIntOrNull() ?: return

    val array = IntArray(arraySize)
    for (i in 0 until arraySize)
    {
        println("Введите элемент массива №${i + 1}:")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }

    val reversedArray = array.reversedArray()

    println("Массив в обратном порядке:")
    println(reversedArray.joinToString(", "))
}
