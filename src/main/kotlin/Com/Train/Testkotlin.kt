package Com.Train
import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var numticket = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundtrip = scanner.nextInt()
    val pur = Purchase(numticket, roundtrip)
    pur.print()

}

class Purchase(var numticket:Int,var roundtrip:Int){
    var tota = (numticket - roundtrip) * 1000 + (roundtrip * 1800)
    fun print(){
        println("Total ticker:"+numticket)
        println("Round trip:"+roundtrip)
        println("Total:"+tota)
    }

}

