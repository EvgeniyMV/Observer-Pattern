import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

class DateGenerator: Observable<String> {
   private var dateState = Date()
   private val observers: MutableList<Observer<String>> = ArrayList<Observer<String>>()
    override fun registerObservable(vararg observer: Observer<String>) {
        observer.forEach {
            observers.add(it)
        }
    }

    override fun notifyChanges(newState: String) {
        observers.forEach(){
            it.observeChanges(newState)
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