class DateObserver: StringObserver() {
    override fun  observeChanges(newState: String) {
        println("${this.javaClass.simpleName}: Текущая дата $newState")
    }
}
