fun main(){
    val dayNumber = 3
    val recommendation = when(dayNumber){
        1 -> "Start your week strong with an Espresso!"
        2 -> "Tuesday Latte treat"
        3 -> "Midweek Mocha Madness"
        4 -> "How about an Iced Coffee today ?"
        5 -> "Frapuccino Friday"
        6 -> "Try a flat while this Saturday"
        7 -> "Chill with some herbal tea on Sunday"
        else -> "Not valid Day"
    }
    println(recommendation)
}
