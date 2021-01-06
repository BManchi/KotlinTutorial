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

    /* // Classes

     val tim = Player("tim")
 //    println(tim.name)
 //    println(tim.lives)
 //    println(tim.level)
 //    println(tim.score)
     tim.show()

     val lou = Player("Lou", 5)
     lou.show()

     val primero = Player("Primero",4, 8)
     primero.show()

     val segundo = Player("Segundo", 2, 5, 1000)
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

     val redPotion = Loot("Red Potion", LootType.POTION, 7.5)
     tim.getLoot(redPotion)
     tim.getLoot(Loot("+3 Chest Armor", LootType.ARMOR, 80.00))
     tim.showInventory()

     println(tim)

     println(tim.showInventory())

     if (tim.dropLoot(redPotion)) {
         tim.showInventory()
     } else {
         println("you don't have ${redPotion.name}")
     }

     val bluePotion = Loot ("Blue potion", LootType.POTION, 6.00)

     if (tim.dropLoot(bluePotion)) {
         tim.showInventory()
     }else {
         println(" You don´t have ${bluePotion.name}")
     }

     if ( tim.dropLoot("+3 Chest Armor ")){
         tim.showInventory()
     } else {
         println("you don´t have a Chest Armor")
     }

 //    for (i in 10 downTo 0 step 2){
 //        println("$i squared is ${i * i}")
 //    }
 //
 //    for(i in 0 .. 100) {
 //        if ((i % 3 == 0) && (i % 5 == 0)){
 //            println(i)
 //        }
 //    }
 */

    // Inheritance
//    val enemy = Enemy("test enemy", 10, 3)
//    println(enemy)
//
//    enemy.takeDamage(4)
//    println(enemy)
//
//    enemy.takeDamage(11)
//    println(enemy)

//    val uglyTroll = Troll("Ugly Troll")
//    println(uglyTroll)
//    uglyTroll.takeDamage(30)
//    println(uglyTroll)
//
//    val vlad = Vampire("Vlad")
//    println(vlad)
//    vlad.takeDamage(8)
//    println(vlad)
//


//    for (i in 1 .. 10){
//    val dracula = VampireKing("Dracula")
//    println(dracula)
//
//    dracula.lives = 0
//
//    do  {
//        if (dracula.dodges()) {
//            dracula.lives +=1
//            continue
//        }
//        if (dracula.runaway()) {
//            println("Dracula ran away")
//            break
//        } else {
//            dracula.takeDamage(80)
//            println(dracula)
//        }
//    } while (dracula.lives > 0)
//    println("=================")
//    }

    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mitrhil", LootType.ARMOR, 103.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red potion", LootType.POTION, 2.0))
    conan.getLoot(Loot("Red potion", LootType.POTION, 2.0))
    conan.getLoot(Loot("Red potion", LootType.POTION, 2.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.showInventory()

    conan.dropLoot("Red potion")
    conan.showInventory()
    conan.dropLoot("Yerba Mate")
}
