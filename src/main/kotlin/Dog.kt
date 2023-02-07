import kotlin.random.Random

class Dog(energy: Int, weight: Int, maxAge: Int, name: String) :
    Animal(energy, weight, maxAge, name) {
    override val move: String = "running"
    override fun offspring(): Dog {
        _energy = Random.nextInt(1, 10)
        _weight = Random.nextInt(1, 5)
        println("A dog $_name was born, it has a maximum age $_maxAge, it has energy $_energy, it has weight $_weight.")
        return Dog(_energy, _weight, _maxAge, _name)
    }
}
