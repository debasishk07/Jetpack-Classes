fun main(){
    var cupSize1 = "Small"
    var cupSize2 = "Large"

    val temp = cupSize1
    cupSize1 = cupSize2
    cupSize2 = temp

    println("Cup Size 1 : $cupSize1 and Cup size 2 : $cupSize2")
}