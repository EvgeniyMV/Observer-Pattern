interface Observer<in T> {
    fun observeChanges(newState: T)
}