interface Observable<T> {
    fun  registerObservable(vararg observer: Observer<T>)
    fun   notifyChanges (newState: T)
}