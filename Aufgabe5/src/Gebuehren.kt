fun main() {
    val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)
    var sumOfFees = gebuehrenRechner(fees)

    println(sumOfFees)
}

fun gebuehrenRechner(fees: List<Double>): Double{
    var sumOfFees: Double = 0.0

    for(fee in fees){
        sumOfFees += fee
    }

    return sumOfFees
}