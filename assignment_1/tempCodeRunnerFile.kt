fun main(){
    val tempCelcius = 75
    val status = when (tempCelcius){
        in 0..40 -> "Too cold"
        in 41..70 -> "Perfect temp"
        in 71..100 -> "Too Hot one"
        else -> "Out of Range"