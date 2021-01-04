fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    val jim = "James T Kirk"
    val tim = "Tim Buchalka"
    println(tim)

    val timsWeeklySalary = 32
    val timsMonthlySalary: Int = timsWeeklySalary * 4

    println("Tim earns $$timsWeeklySalary by week")
    println("Tim earns $$timsMonthlySalary by month")

    println()

    val apples = 6
    val organges = 5
    val fruit: Int = apples + organges
    println("Tim has $fruit apples and/or oranges")

    println("Aquarter of the apples is $apples / 4")

    println()
    val weeks = 234
    val years: Double = weeks / 52.0
    println("$weeks weeks is $years years")


    println("My name is "+ tim)
    println("Jim is $jim")

}
