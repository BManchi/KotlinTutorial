class Player (val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

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

    fun getLoot (item: Loot){
        inventory.add(item)
    }

    fun dropLoot (item: Loot): Boolean {
        return if (inventory.contains(item)){
            inventory.remove(item)
            println("${item.name} will be dropped")
            true
        } else {
            println("${item.name} is not on the inventory")
            false
        }
    }

    fun dropLoot (name: String): Boolean {
        for (item in inventory) {
            if (item.name == name) {
                inventory.remove(item)
                println("${item.name} will be dropped")
                return true
            } else {
                println("$name is not on the inventory")
                break
            }
        }

        return false
    }

    fun showInventory() {
        println("$name's inventory:")
        var total = 0.0
        for (item in inventory){
            println(item)
            total += item.value
        }
        println("===================")
        println("Total score is: $total")
        println("===================")
    }
}