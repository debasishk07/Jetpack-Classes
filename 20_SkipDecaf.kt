fun main(){
    for( i in 1..10){
        if(i ==4 || i == 8 ){
            println("Skipping decaf order $i ")
            continue
        }
        println("Processing order #$i")
    }
}