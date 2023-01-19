fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)
    var newList = multiplicator(numbers, 5.0)
    println(newList)
}

fun multiplicator(oldList: MutableList<Double>, d: Double): MutableList<Double>{
    var newList: MutableList<Double> = mutableListOf()
    var i = 0

    while(i < oldList.size){
        newList.add(i, oldList[i] * d)
        i++
    }

    return newList
}
