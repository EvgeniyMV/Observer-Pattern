interface Observer {
    fun <T> observeChanges(newState: T)
}