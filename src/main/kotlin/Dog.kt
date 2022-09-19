class Dog: Observer<Any> {
    override  fun  observeChanges(newState: Any) {
        println("${this.javaClass.simpleName}: Bark?")
    }
}
