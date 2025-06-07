fun main(){
    val caffineLevel = 85
    val strength = when(caffineLevel){
        in 0..30 -> "Mild"
        in 30..70 -> "Medium"
        in 70..100 -> "Strong"
        else -> "Unknown value"
    }
    println("Your coffee strength is : $strength")
}