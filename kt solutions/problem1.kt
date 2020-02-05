fun main(){
    var sumof: Int = 0
    for (i in 1 until 1000){
        if(i.rem(3)==0 || i.rem(5)==0){
            println(i)
            sumof =  sumof + i
        }
    }
    println(sumof)
}
