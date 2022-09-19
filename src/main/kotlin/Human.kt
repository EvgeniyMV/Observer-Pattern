class Human: StringObserver() {
    override fun  observeChanges(newState: String) {
        println("${this.javaClass.simpleName}: О, да это же новая дата $newState ")
    }
}