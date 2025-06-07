fun main(){
    val coffeePrice = 7
    val message = when (coffeePrice){
        in 1..3 -> "That's a budget one"
        in 4..6 -> "Mid-range one"
        in 7..10 -> "Premium one"
        else -> "Price is out of range"
    }
    println(message)
}