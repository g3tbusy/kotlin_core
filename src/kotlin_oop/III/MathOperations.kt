class MathOperations
{
    fun add(num1: Any, num2: Any): Double
    {
        return when
        {
            num1 is Int && num2 is Int -> (num1 + num2).toDouble()
            num1 is Double && num2 is Double -> num1 + num2
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }

    fun sub(num1: Any, num2: Any): Double
    {
        return when
        {
            num1 is Int && num2 is Int -> (num1 - num2).toDouble()
            num1 is Double && num2 is Double -> num1 - num2
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }

    fun mul(num1: Any, num2: Any): Double
    {
        return when
        {
            num1 is Int && num2 is Int -> (num1 * num2).toDouble()
            num1 is Double && num2 is Double -> num1 * num2
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }

    fun div(num1: Any, num2: Any): Double
    {
        return when
        {
            num1 is Int && num2 is Int -> (num1.toDouble() / num2).toDouble()
            num1 is Double && num2 is Double -> num1 / num2
            else -> throw IllegalArgumentException("Некорректная операция")
        }
    }
}

fun main()
{
    println("Введите первое число:")
    val num1 = readLine()!!.toDouble()

    println("Введите второе число:")
    val num2 = readLine()!!.toDouble()

    println("Введите тип операции (1. add // 2. sub // 3. mul // 4. div):")
    val operation = readLine()!!.trim()

    val mathOperations = MathOperations()
    val result: Double

    result = when (operation)
    {
        "1" -> mathOperations.add(num1, num2)
        "2" -> mathOperations.sub(num1, num2)
        "3" -> mathOperations.mul(num1, num2)
        "4" -> mathOperations.div(num1, num2)
        else -> throw IllegalArgumentException("Некорректная операция")
    }

    println("Результат: $result")
}