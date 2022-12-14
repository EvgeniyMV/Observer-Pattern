import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

class NumberGenerator: Observable<Int> {
   private var numberState = 0
   private val observers: MutableList<Observer<Int>> = ArrayList<Observer<Int>>()
    override fun registerObservable(vararg observer: Observer<Int>) {
        observer.forEach {
            observers.add(it)
        }
    }
    override fun  notifyChanges(newState: Int) {
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
}