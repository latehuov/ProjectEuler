import java.util.Arrays
fun main(){
    var fibSum: Int = 0
    var curFib: Int = 0
    var prevFib1: Int = 1
    var prevFib2: Int = 0
    while(curFib < 4000000){

        curFib = prevFib1 + prevFib2
        println(curFib)

        prevFib2 = prevFib1
        prevFib1 = curFib

        if (curFib.rem(2)==0){
            fibSum = fibSum + curFib
        }
    }
    println("sum of even fibonacci numbers under 4,000,000: $fibSum")
}
