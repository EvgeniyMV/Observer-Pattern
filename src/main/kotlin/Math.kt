class Math:Observer {
    override fun <T> observeChanges(newState: T) {
        if (newState is Int) {
            println(if (newState % 2 == 0) "${this.javaClass.simpleName}: Это число четное" else "${this.javaClass.simpleName}: Это число нечетное")
        } else {
            println("${this.javaClass.simpleName}: Ну это явно не число - ${newState.toString()}")
        }

    }
}