package kotlin_oop.VI

abstract class Animals
{
    abstract fun sound()
}

class Dog : Animals()
{
    override fun sound()
    {
        println("гав")
    }
}

class Cat : Animals()
{
    override fun sound()
    {
        println("мяу")
    }
}

class Bird : Animals()
{
    override fun sound()
    {
        println("кукареку")
    }
}

fun main()
{
    print("Введите название животного (dog, cat, bird):")
    val animalName = readLine()!!.lowercase()

    val animal: Animals = when (animalName)
    {
        "dog" -> Dog()
        "cat" -> Cat()
        "bird" -> Bird()
        else -> throw IllegalArgumentException("Неизвестное животное")
    }

    animal.sound()
}
