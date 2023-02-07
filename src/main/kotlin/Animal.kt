import kotlin.random.Random




    open class Animal(energy: Int, weight: Int, maxAge: Int, name: String) {
        private var currentAge: Int = 2
        protected val _maxAge = maxAge
        protected var _name = name
        protected var _weight = weight
        protected var _energy = energy
        var isTooOld = false


        protected open val move = "moving"

        open fun isTooOld() {
            if (currentAge > _maxAge) {
                isTooOld = true

            }
        }

        open fun sleep() {

            isTooOld()

            if (this.isTooOld) {
                println("$_name nothing doing")
                println("Energy - $_energy ,weight - $_weight  current age - $currentAge")
                return

            }
            tryIncrementAge()
            _energy += 5
            currentAge += 1

            println("$_name sleep")
            println("Energy - $_energy , current age - $currentAge")
        }

        open fun eating() {

            isTooOld()

            if (this.isTooOld) {
                println("$_name nothing doing")
                println("Energy - $_energy ,weight - $_weight  current age - $currentAge")
                return
            }
            tryIncrementAge()
            _energy += 3
            _weight += 1

            println("$_name eating")
            println("Energy - $_energy ,weight - $_weight  current age - $currentAge")
        }

        open fun moving() {


            isTooOld()

            if (this.isTooOld) {
                println("$_name nothing doing")
                println("Energy - $_energy ,weight - $_weight  current age - $currentAge")
                return
            }
            if (_weight <= 0) {
                println("$_name nothing doing")
                println("Energy - $_energy ,weight - $_weight  current age - $currentAge")
                return
            }
            if (_energy < 0) {
                println("$_name nothing doing")
                println("Energy - $_energy ,weight - $_weight  current age - $currentAge")
                return
            }
            tryIncrementAge()
            _energy -= 5
            _weight -= 1

            println("$_name ${this.move}")
            println("Energy - $_energy ,weight - $_weight  current age - $currentAge")


        }


        fun tryIncrementAge() {
            if (Random.nextBoolean()) {
                currentAge += 1
            }
        }


        open fun offspring(): Animal {

            _energy = Random.nextInt(1, 10)
            _weight = Random.nextInt(1, 5)
            currentAge = 0

            println("An animal named $_name was born, it has a maximum age $_maxAge, it has energy $_energy, it has weight $_weight.")
            return Animal(_energy, _weight, _maxAge, _name)
        }


    }







