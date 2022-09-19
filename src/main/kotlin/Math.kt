class Math: IntObserver() {
    override fun  observeChanges(newState: Int) {
        println(if (newState % 2 == 0) "${this.javaClass.simpleName}: Это число четное" else "${this.javaClass.simpleName}: Это число нечетное")
    }
}