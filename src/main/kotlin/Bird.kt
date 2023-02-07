import kotlin.random.Random

class Bird(energy: Int, weight: Int, maxAge: Int, name: String) :
    Animal(energy, weight, maxAge, name) {
    override val move: String = "flying"
    override fun offspring(): Bird {
        _energy = Random.nextInt(1, 10)
        _weight = Random.nextInt(1, 5)
        println("A bird $_name was born, it has a maximum age $_maxAge, it has energy $_energy, it has weight $_weight.")

        return Bird(_energy, _weight, _maxAge, _name)
    }

}
