    fun main(args: Array<String>){
       val numberGenerator = NumberGenerator()
        val dateGenerator = DateGenerator()

        val human: Observer<String> = Human()
        val cat: Observer<Any> = Cat()
        val math: Observer<Int> = Math()
        val dog: Observer<Any> = Dog()
        val dateObserver: Observer<String> = DateObserver()

        numberGenerator.registerObservable(math, cat, dog)
        numberGenerator.onNewNumberState()
        dateGenerator.registerObservable(human, cat, dog, dateObserver)
        dateGenerator.onNewDateState()
     /* Some changes for example*/
    }

