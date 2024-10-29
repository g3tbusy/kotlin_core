package kotlin_oop.V

open class Person3(val name: String, val role: String)
{
    open fun showInfo()
    {
        println("Имя: $name, Роль: $role")
    }
}

class Moderator(name: String) : Person3(name, "Moderator")
{
    override fun showInfo()
    {
        println("Модератор $name что то проверяет.")
    }
}

class Admin(name: String) : Person3(name, "Admin")
{
    override fun showInfo()
    {
        println("Администратор $name всем управляет (крутой).")
    }
}

fun main()
{
    println("Введите имя и роль пользователя (Moderator или Admin):")
    val input = readLine()!!.split(" ")

    if (input.size != 2)
    {
        println("Ошибка ввода. Пожалуйста, введите только имя и роль.")
        return
    }

    val name = input[0]
    val role = input[1]

    val user: Person3 = when (role)
    {
        "Moderator" -> Moderator(name)
        "Admin" -> Admin(name)
        else -> {
            println("Ошибка: неизвестная роль \"$role\".")
            return
        }
    }

    user.showInfo()
}
