fun main()
{
    println("Введите количество элементов первого множества:")
    val firstSetSize = readLine()!!.toInt()

    println("Введите $firstSetSize элементов первого множества:")
    val firstSet = mutableSetOf<Int>()
    repeat(firstSetSize)
    {
        firstSet.add(readLine()!!.toInt())
    }

    println("Введите количество элементов второго множества:")
    val secondSetSize = readLine()!!.toInt()

    println("Введите $secondSetSize элементов второго множества:")
    val secondSet = mutableSetOf<Int>()
    repeat(secondSetSize) {
        secondSet.add(readLine()!!.toInt())
    }

    val unionSet = firstSet.union(secondSet)

    println("Объединение двух множеств: ${unionSet.joinToString(" ")}")
}
