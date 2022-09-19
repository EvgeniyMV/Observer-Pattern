abstract  class IntObserver: Observer<Int> {
    override fun observeChanges(newState: Int) {
        println("Это число")
    }
}