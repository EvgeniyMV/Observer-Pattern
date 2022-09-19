class Cat: Observer {
    override  fun <T> observeChanges(newState: T) {
        println("${this.javaClass.simpleName}: Meow?")
    }
}