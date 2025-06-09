fun main(){
    for (i in 1..10){
        if(i==5){
            println("Rush Hour!")
            break
        }
        println("Processing Order # $i")
    }
}