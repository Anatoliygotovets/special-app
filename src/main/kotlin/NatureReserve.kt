class NatureReserve {

    //val currentAge = Animal.
    private var natureReserveList = mutableListOf(
        Bird(20, 3, 4, "Vorobey"),
        Bird(18, 3, 11, "Popugay"),
        Bird(17, 3, 5, "Golub"),
        Bird(18, 3, 5, "Kedrovka"),
        Fish(15, 6, 8, "Karas"),
        Fish(22, 10, 12, "Nalim"),
        Fish(20, 12, 9, "Sudak"),
        Dog(25, 8, 20, "Huski"),
        Dog(27, 15, 19, "Senbirnar"),
        Animal(15, 16, 30, "Turtle"),
        Animal(25, 1, 6, "Rat")
    )

    fun lifeCycle(numberOfCycle: Int) {
        for (numberIteration in 1..numberOfCycle) {
            println("-----------------------------$numberIteration-iteration-------------------------------------")
            val deadList = mutableListOf<Animal>()

            if (natureReserveList.isEmpty()) {
                println("nature reserve is empty")
                return
            } else {
                for (animal in natureReserveList.indices) {
                    when ((1..4).random()) {
                        1 -> natureReserveList[animal].sleep()
                        2 -> natureReserveList[animal].moving()
                        3 -> natureReserveList[animal].eating()
                        4 -> {
                            val child = natureReserveList[animal].offspring()
                            child.let { natureReserveList.add(it) }
                        }

                    }
                    if (natureReserveList[animal].isTooOld) {
                        deadList.add(natureReserveList[animal])
                        println("Animal died")

                    }

                }
            }

            natureReserveList.removeAll(deadList)
            println("------------------------------${natureReserveList.size}-animals in nature reserve-----------------------------------")

        }

    }
}


