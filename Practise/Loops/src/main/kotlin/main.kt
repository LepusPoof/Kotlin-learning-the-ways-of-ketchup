fun main() {
    // FOR LOOPS - LISTS
    println("\n --FOR LOOPS-- \n")

    for(i in 1..10){
        print("$i ")
        if(i == 10){
            println()
        }
    }

    for(i in 10 downTo 1){
        print("$i ")
        if(i == 1){
            println()
        }
    }

    for(i in 1..10 step 2){
        print("$i ")
        if(i > 9){
            println()
        }
    }

    for(i in 6 downTo 0 step 2){
        print("$i ")
        if(i == 0){
            println("\n")
        }
    }

    // FOR LOOPS - LISTS
    println(" --LISTS-- \n")
    val bestLanguages = listOf("Kotlin", "Java", "C++", "Javascript")

    for(i in bestLanguages.indices){ //INDICES = THE PARTS OF A LIST
        println(bestLanguages[i])
        if(bestLanguages[i] == "Javascript"){
            println("")
        }
    }

    for((index, value) in bestLanguages.withIndex()){
        println("Number ${index+1} is $value")
        if(index+1 == 4 || value == "Javascript"){
            println()
        }
    }

    //FOR LOOPS - SETS

    val myFriends = setOf("Karolina", "Gracjan", "Przemek", "Antek", "Maciej")

    println(" --SETS-- \n")

    println("1ST WAY OF LOOPING")
    for(friend in myFriends){
        println(friend)
        if(friend == "Maciej"){
            println()
        }
    }
    println("2ND WAY OF LOOPING")
    myFriends.forEach{
        e -> println("$e ")
    }
    println()

    println("3RD WAY OF LOOPING")
    for(i in 0 until myFriends.size){
        println("${myFriends.elementAt(i)}")
        if(i == myFriends.size-1){
            println()
        }
    }

    println("WITH INDEXING")
    myFriends.forEachIndexed({i, friend -> println("$i - $friend")})
    println()

    println("I have several friends:")
    var end = ""

    myFriends.forEachIndexed({num, friend ->
        if(num+1 == 1){
            end = "st"
        } else if(num+1 == 2){
            end = "nd"
        } else if(num+1 == 3){
            end = "rd"
        } else {
            end = "th"
        }
        print("the ${num+1}$end one is $friend")
        if(friend == "Maciej"){
            print(".\n\n")
        } else {
            print(",\n")
        }
    })

    //FOR LOOPS - MAPS
    println(" --MAPS-- \n")

    val friendCity = mapOf("Przemek" to "Stargard", "Karolina" to "Warszawa", "Gracjan" to "Gdansk", "Antek" to
            "Szczecin", "Maciej" to "Pilchowo")

    println(friendCity)
    println()

    for(entry in friendCity){
        println("${entry.key} lives in ${entry.value}. ")
    }
    println()

    for((friend, city) in friendCity){
        println("$friend lives in $city.")
    }


    //WHILE LOOPS

    println()
    println("--WHILE LOOPS--\n")
    var numberOfTeeth = 32;


    while (numberOfTeeth >= 20){
        println("You can probably still bite other people. You have $numberOfTeeth teeth left.\n")
        numberOfTeeth--;
    }

    //DO...WHILE LOOPS

    println()
    println("--DO...WHILE LOOPS--")
    println()

    val falseStatement = false;

    do{
        println("I loop once!")
    } while (falseStatement == true)
}

