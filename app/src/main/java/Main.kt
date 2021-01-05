fun main(args: Array<String>) {
    /*println("Hello World")
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


    println("My name is $tim")
    println("Jim is $jim")*/

    //Conditions
    /*val lives = 3

    var isGameOver = (lives < 1)
    println(isGameOver)

    if  (isGameOver) {
        println("Game over!")
    } else {
        println("You're still alive!")
    }*/

    /*println("How old are you: ")
    val age = readLine()!!.toInt()
    println("age is $age")

    val message: String
    message = if (age<18) {
        "You're too young to vote"
    } else if (age == 100) {
        "Congratulations"
    } else {
        "you can vote"
      }
//    val message: String
//    message = if (age<18) {
//        "You're too young to vote"
//    } else if (age == 100) {
//        "Congratulations"
//    } else {
//        "you can vote"
//    }

    println(message)*/

    // Classes

    val tim = Player("tim")
//    println(tim.name)
//    println(tim.lives)
//    println(tim.level)
//    println(tim.score)
    tim.show()

    val lou = Player("Lou", 5)
    lou.show()

    var primero = Player("Primero",4, 8)
    primero.show()

    var segundo = Player("Segundo", 2, 5, 1000)
    segundo.show()
    //println(segundo.weapon.name.toUpperCase())
    //println(segundo.weapon.damageInflicted)

    val axe = Weapon("Axe", 12)
    primero.weapon = axe

    //println(primero.weapon.name)
    //println(primero.weapon.damageInflicted)

    val sword = Weapon("Sword", 10)

    tim.weapon = sword
    tim.show()

    //lou.weapon = sword
    lou.weapon = tim.weapon
    lou.show()
    tim.show()
    //println(tim.weapon.name)
    tim.weapon = Weapon("Spear", 14)
    //println(tim.weapon.name)

    tim.show()
}
