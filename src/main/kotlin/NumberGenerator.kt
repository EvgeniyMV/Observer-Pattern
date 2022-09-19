import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

class NumberGenerator: Observable {

    var numberState = 0
    var dateState = Date()
    val observers: MutableList<Observer> = ArrayList<Observer>()
    override fun registerObservable(vararg observer: Observer) {
        observer.forEach {
            observers.add(it)
        }
    }

    override fun <T> notifyChanges(newState: T) {
        observers.forEach(){
            it.observeChanges(newState)
        }
    }


    fun onNewNumberState(){
        thread (start = true){
            try {
                while (true) {
                    numberState++
                    notifyChanges(numberState)
                    Thread.sleep(3000)
                }
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }

    fun onNewDateState(){
        thread (start = true){
            val formatter = SimpleDateFormat("dd.MM.yyyy")
            try {
                while (true) {
                    dateState = Date()
                    val date = formatter.format(dateState)
                    notifyChanges(date)
                    Thread.sleep(3000)
                }

            } catch (e: Exception) {
                println(e.message)
            }
        }
    }
}