class Weapon (val name: String, var damageInflicted: Int) {

    override fun toString(): String {
        return """
            Weapon's name: $name
            damage: $damageInflicted            
        """
    }
}