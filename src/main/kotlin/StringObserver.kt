abstract class StringObserver: Observer<String> {
    override fun observeChanges(newState: String) {
        println("Это строка")
    }
}