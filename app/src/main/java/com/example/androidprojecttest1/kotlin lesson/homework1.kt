package com.example.androidprojecttest1

fun main() {

    //1
    //Declare two nullable string variables, firstName and lastName. Use the null elvis operator (?:) to
    //get their values or use default values like "Unknown" if they are null. Print a combined name like
    //"First Name: [firstName], Last Name: [lastName]".

    var firstName: String? = null
    var lastName: String? = null
    println("firstName ${firstName ?: "unknown"} lastname ${lastName ?: "Unknown"}")
    firstName = "asef"
    lastName = "qurbanov"
    println("firstName ${firstName ?: "unknown"} lastname ${lastName ?: "Unknown"}")



    //2
    //Declare a nullable integer variable age. Use the Elvis operator (?:) to provide a default value of 0
    //if age is null. Print the result.
    var age1: Int? = null
    println(age1 ?: 0)
    age1 = 45
    println(age1 ?: 0)

    //3    Define variables for the current city (e.g., "Baku") and country (e.g., "Azerbaijan"). Print a
    //sentence like "You are currently in [city], [country]" using a string template.

        val city="baku"
        val country="Azerbaycan"
        println("You are currently in $city,$country")


    //4
    // Create an array to store the names of three fruits. Print the first and last elements of the array.

    val array = arrayOf("alma", "armud", "nar")
    println("----4")
    println(array[0])
    println(array[2])


    //Declare an integer variable with your age. Convert it to a string and print a message like "You are
    //[age] years old.”
        val age: Int = 25
        val ageStr = 25.toString()

        println("You are $ageStr years old.")
    //387 7 dene 50 1 eded 20 1 eded 10 1 eded 5  2 eded 1

    //6

    val manat50 = 50
    val manat20 = 20
    val manat10 = 10
    val manat5 = 5
    var say = 0
    var eded = 387

    println("50 manat: "+  eded / manat50 + " eded")
    say += eded / manat50
    eded %= manat50

    println("20 manat: "+  eded / manat20 + " eded")
    say += eded / manat20
    eded %= manat20
    println("10 manat: "+  eded / manat10 + " eded")
    say += eded / manat10
    eded %= manat10
    println("5 manat: "+  eded / manat5 + " eded")
    say += eded / manat5
    eded %= manat5

    say += eded
    println("1 manat: "+  eded  + " eded")
    println("Toplam say: $say")


}