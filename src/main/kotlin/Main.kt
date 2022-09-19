    fun main(args: Array<String>){
       val generator = NumberGenerator()

        val human = Human()
        val cat = Cat()
        val math = Math()
        val dateObserver = DateObserver()

        generator.registerObservable(human, cat, math, dateObserver)
        generator.onNewNumberState()
        generator.onNewDateState()

        generator.registerObservable(object : Observer {
            override fun <T> observeChanges(newState: T) {
                if (newState is Int) {
                    println("Я неведомый наблюдатель за числом $newState")
                } else {
                    println("Я неведомый наблюдатель за сущностью ${newState.toString()}")
                }

            }

        })
    }

