fun main() {
    //IMMUTABLE MAPS

    val europeCapitals = mapOf("Athens" to "Greece", "Berlin" to "Germany", "Copenhagen" to "Denmark")
    println(europeCapitals)

    println("\n" + europeCapitals.values)
    println("\n" + europeCapitals.keys)
    println("\n" + europeCapitals.entries)
    println("\n" + europeCapitals.size)
    println("\n" + europeCapitals.getValue("Berlin"))
    println("\n" + europeCapitals.isEmpty())

    //MUTABLE MAPS

    var countriesToContinent = mutableMapOf("Japan" to "Asia", "France" to "Europe", "Togo" to "Africa")

    println(countriesToContinent)

    countriesToContinent.get("Japan")

    println(countriesToContinent.get("Japan"))

    println(countriesToContinent + Pair("USA", "North America"))
    println(countriesToContinent + Pair("Japan", "Oceania"))

    countriesToContinent.putAll(setOf("Argentina" to "South America", "Atlantis" to "Under water"))
    countriesToContinent.remove("Atlantis")
    println(countriesToContinent)
}