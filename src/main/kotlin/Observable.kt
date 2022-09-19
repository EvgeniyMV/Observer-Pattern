interface Observable {
    fun registerObservable(vararg observer: Observer)
    fun  <T> notifyChanges (newState: T)
}