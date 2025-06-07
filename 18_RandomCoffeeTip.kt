fun main(){
    val randomTip = (1..4).random()
    val tip = when (randomTip){
        1-> "Don't forget to stir before sipping"
        2-> "Pair your brew with a snacks"
        3-> "Try without sugar today"
        4-> "Smaile, and enjoy"
        else -> "Eat 5 star, Do nothing!"
    }
    println("Coffee Tip : $tip ")
}
