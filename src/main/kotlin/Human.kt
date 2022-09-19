class Human: Observer {
    override fun <T> observeChanges(newState: T) {
        if (newState is Int) {
            println("${this.javaClass.simpleName}: О, да это же новое число $newState ")
        } else {
            println("${this.javaClass.simpleName}: Ну это явно не число - ${newState.toString()}")
        }

    }
}