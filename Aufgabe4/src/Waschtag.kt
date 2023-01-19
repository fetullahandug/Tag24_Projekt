fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )

    var redShirts: MutableList<String> = mutableListOf()
    var blueShirts: MutableList<String> = mutableListOf()

    for(shirt in shirts){
        if(shirt == "rot"){
            redShirts.add(shirt)
        }else if(shirt == "blau"){
            blueShirts.add(shirt)
        }else{
            println("T-Shirt nicht zuordenbar!")
        }
    }

    //println(redShirts)
    //println(blueShirts)
}