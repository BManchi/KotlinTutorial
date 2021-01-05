class Player (val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    val inventory = ArrayList<Loot>()

    fun show() {
        if (lives > 0 ) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            $weapon
        """

    }


    fun showInventory() {
        println("$name's inventory:")
        for (item in inventory){
            println(inventory)
        }
        println("===================")

    }
}