

open class Vampire (name: String): Enemy(name, 20, 3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}

class VampireKing (name: String): Vampire (name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runaway(): Boolean {
        return lives < 2
    }

    fun dodges(): Boolean {
        val rand = java.util.Random()
        val chance = rand.nextInt(6)
        if (chance > 3) {
            println("(!) $name dodges")
            return true
        }
        return false
    }
}