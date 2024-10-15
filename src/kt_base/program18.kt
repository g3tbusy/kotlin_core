fun main() {
    val input = java.util.Scanner(System.`in`)

    println("Введите количество элементов первого множества (n):")
    val n = input.nextInt()
    val firstSet = mutableSetOf<Int>()

    println("Введите $n элементов первого множества (по одному на каждой строке):")
    for (i in 0 until n)
    {
        firstSet.add(input.nextInt())
    }

    println("Введите количество элементов второго множества (m):")
    val m = input.nextInt()
    val secondSet = mutableSetOf<Int>()

    println("Введите $m элементов второго множества (по одному на каждой строке):")
    for (i in 0 until m)
    {
        secondSet.add(input.nextInt())
    }

    val commonElements = firstSet.intersect(secondSet)

    if (commonElements.isNotEmpty())
    {
        println("Общие элементы:")
        commonElements.forEach { println(it) }
    }
    else
    {
        println("Нет общих элементов.")
    }
}
