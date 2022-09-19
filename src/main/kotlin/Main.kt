    fun main(args: Array<String>){
       val numberGenerator = NumberGenerator()
        val dateGenerator = DateGenerator()

        val human: Observer<String> = Human()
        val cat: Observer<Any> = Cat()
        val math: Observer<Int> = Math()
        val dateObserver: Observer<String> = DateObserver()

        numberGenerator.registerObservable(math, cat)
        numberGenerator.onNewNumberState()
        dateGenerator.registerObservable(human, cat, dateObserver)
        dateGenerator.onNewDateState()
    }

