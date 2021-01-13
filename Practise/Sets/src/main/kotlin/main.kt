fun main() {
    //IMMUTABLE SETS

    val veganFood = setOf("Hummus", "Falafel", "basically every vegetable ever")
    println(veganFood)
    println(veganFood.contains("Fruits"))
    println(veganFood.size)

    println(veganFood.elementAtOrElse(5){"Nothing"})

    println(veganFood.elementAtOrNull(5))

    println(veganFood.lastOrNull())

    // MUTABLE SETS

    var nonVeganFood = mutableSetOf<String>("Meat", "Eggs", "Dairy", "Seeds")
    println(nonVeganFood)

    nonVeganFood.remove("Seeds")
    println("\n"+ nonVeganFood)

    println(nonVeganFood.size)
    println(nonVeganFood.elementAtOrElse(4){"Nothing found, sir."})

    println("\nI can list all the vegan food! For example: ${veganFood.elementAt(0)} and ${veganFood.elementAt(1)}! " +
            "It's ${veganFood.elementAtOrElse(2){"vegetables and fruits"}}! Now you list the meat options!")
    println("I only know ${nonVeganFood.size-1} of them. I think its ${nonVeganFood.elementAt(0)} and " +
            "${nonVeganFood.elementAt(1)}? Maybe some ${nonVeganFood.elementAtOrElse(2){"seeds"}}?")
}