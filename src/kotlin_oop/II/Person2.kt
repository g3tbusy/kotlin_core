open class Person2(private var name: String)
{
    fun printName()
    {
        println("Name: $name")
    }
}

class Student(name: String) : Person2(name)
{
    private var studentId: Int? = null

    fun setStudentId(newId: Int)
    {
        studentId = newId
    }

    fun printStudentDetails()
    {
        super.printName()
        println("Student ID: $studentId")
    }
}

fun main()
{
    println("Введите количество студентов:")
    val n = readLine()!!.toInt()

    for (i in 1..n)
    {
        println("Введите имя и идентификатор студента (через пробел):")
        val (name, id) = readLine()!!.split(' ')
        val student = Student(name)
        student.setStudentId(id.toInt())
        student.printStudentDetails()
    }
}