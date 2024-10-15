fun main()
{
    println("Введите элементы списка, разделенные запятыми:")
    val input = readLine() ?: ""

    val elements = input.split(",").map { it.trim() }

    val frequencyMap = mutableMapOf<String, Int>()

    for (element in elements)
    {
        frequencyMap[element] = frequencyMap.getOrDefault(element, 0) + 1
    }

    println("Результат:")
    for ((key, value) in frequencyMap)
    {
        println("$key: $value")
    }
}
