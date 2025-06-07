fun main(){
    val originalPrice = 5.0
    for(discount in 10..50 step 10){
        val discountedPrice = originalPrice - (originalPrice * discount / 100)
        println("$discount % off = $ $discountedPrice")
    }
}