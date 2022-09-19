class DateObserver: Observer {
    override fun <T> observeChanges(newState: T) {
        if (newState is Int) {
            println("${this.javaClass.simpleName}: Не понимаю, что означают эти числа $newState")
        } else {
            println("${this.javaClass.simpleName}: Актуальная дата $newState")
        }
    }
}