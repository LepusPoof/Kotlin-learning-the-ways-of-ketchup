fun main(args: Array<String>) {
    //IMMUTABLE LISTS
    val greatBands = listOf("Tool", "Puscifer", "GoGo Penguin", "Alt-J")
    println(greatBands)

    println(greatBands[2])

    //MUTABLE LISTS

    var greatSongs = mutableListOf<String>("Vicarious", "The Arsonist", "Don't Go", "Deadcrush")
    println(greatSongs)

    greatSongs.add("Again")
    println(greatSongs)

    println(greatSongs[1])
    greatSongs.remove("The Arsonist")
    println(greatSongs)

    greatSongs.removeAt(1)
    println(greatSongs)

    println(greatSongs.size)

    println("\nI have ${greatBands.size} favourite bands - $greatBands. The most notable of the ${greatSongs.size} songs they wrote are $greatSongs.")

}