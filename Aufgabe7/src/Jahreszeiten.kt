fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )


    for(monat in monate){
        println("Der Monat $monat ist im ${jahreszeitErmitteln(monat)}")
    }

    println()

    for(monat in monate){
        if(jahreszeitErmitteln(monat) == "Sommer"){
            println("Der Monat $monat ist im ${jahreszeitErmitteln(monat)}")
        }
    }

    println()

    for(monat in monate){
        if(monat != "Juni" && monat != "September"){
            println("Der Monat $monat ist im ${jahreszeitErmitteln(monat)}")
        }
    }

}

fun jahreszeitErmitteln(monat: String): String{
    when(monat){
        "Dezember" -> return "Winter"
        "Januar" -> return "Winter"
        "Februar" -> return "Winter"

        "März" -> return "Frühling"
        "April" -> return "Frühling"
        "Mai" -> return "Frühling"

        "Juni" -> return "Sommer"
        "Juli" -> return "Sommer"
        "August" -> return "Sommer"

        "September" -> return "Herbst"
        "Oktober" -> return "Herbst"
        "November" -> return "Herbst"
    }

    return "noResult"
}