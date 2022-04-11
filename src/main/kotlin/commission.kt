fun main() {

    val itemCount = 3000.00
    val minCommission = 35.00
    val percentageCommission = 0.75

    var itemCommission = itemCount * percentageCommission/100

    var result: Int = if (itemCommission > minCommission) (itemCount * percentageCommission).toInt() else (minCommission * 100).toInt()

    println("Item Commission:$result")


}