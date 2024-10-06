package com.example.androidprojecttest1

fun main() {
    // 1.Create a program to check if a number is divisible by 5 using.
    val number: Int = 25
    if ((number % 5) == 0) {
        println("divisible")
    } else println("indivisible")

    /* 2.Create a program that takes a grade as input and prints the corresponding grade letter (A 91-100, B 81-90, C
    71-80, D 61-70, or F 51-60).*/
    val operator = 99
    if (operator >= 91 && operator <= 100) {
        println("A")
    } else if (operator >= 81) println("B")
    else if (operator >= 71) println("C")
    else if (operator >= 61) println("D")
    else if (operator >= 51) println("E")
    else {
        println("not found")
    }

    /* when {
         operator >= 91 && operator <= 100 -> println("A")
         operator >= 81 -> println("B")
         operator >= 71 -> println("C")
         operator >= 61 -> println("C")
         operator >= 51 -> println("C")
         else -> println("not found")
     } */

    //3. Write a program to determine the season based on a given month
    val month = 12
    when {
        month >= 3 && month<=5 -> println("Spring")
        month >=6 && month <= 8 -> println("Summer")
        month >= 9 && month <= 11 -> println("Autumn")
        else -> println("winter")
    }

    //4.Create a program to check if a given character is a digit, letter, or symbol
    val symbol: Any = 5
    when (symbol) {
        is Int -> println("Digit")
        is Char -> println("Char")
        is String -> println("String")
    }

    //5.Write a program to check if a variable is of type String.
    val variable: Any = "variable"
    when (variable) {
        is String -> println("String")
        else -> println("notString")
    }
    //6.Create a program to convert a variable of type Any to String.
    val anyVariable: Any = 563
    val stringVariable: String = anyVariable.toString()
    println(stringVariable)

    //7.Develop a program to convert a variable of type Any to Int.
    val Variable1: Any = 123
    val intVariable1: Int? = Variable1.toString().toIntOrNull()
    println("$intVariable1")

    //8.Develop a program to classify a given character as uppercase, lowercase, or special character.
    val char: Char = 'h'
    val charType = when {
        char.isUpperCase() -> "uppercase"
        char.isLowerCase() -> "lowercase"
        else -> "Special character"
    }
    println("The character '$char' is classified as $charType.")

    //9.Implement a program to categorize a person's age as infant, child, teenager, adult, or senior
    val personAge = 16
    when {
        personAge < 0 -> println("Invalid age")
        personAge < 1 -> println("Infant")
        personAge < 13 -> println("child")
        personAge < 20 -> println("teenager")
        personAge < 60 -> println("adult")
        else -> println("senior")
    }
    //10.Develop a program to check if a variable is of type Int or Long.
    val variable4: Any = 12L
    val variable4Type = when (variable4) {
        is Int -> "Int"
        is Long -> "Long"
        else -> println("not one")
    }
    println("$variable4Type")

    //11.Create a program to convert a variable of type Any to Boolean.
    val boolean1: Any = "true"
    var booleanType = when (boolean1) {
        is Boolean -> boolean1
        is String -> boolean1.toBoolean()
        is Int -> boolean1 != 0
        is Long -> boolean1 != 0L
        is Double -> boolean1 != 0.0
        is Float -> boolean1 != 0.0f
        else -> false
    }
    println("$booleanType")

//12.Implement a program to convert a variable of type Any to Double.
    val double: Any = "7.58"
    val doubleValue = when (double) {
        is Double -> double
        is String -> double.toDoubleOrNull() ?: 0.0
        is Int -> double.toDouble()
        is Long -> double.toDouble()
        is Float -> double.toDouble()
        is Boolean -> if (double) 1.0 else 0.0
        else -> 0.0
    }
    println("The converted double value is: $doubleValue")

//13.Write a program to check if a variable is null or not.
    // sual olaraq qaldi as isletmeli idim?
    val variable6: String? = "123"
    if (variable == null)
        println("variable null")
    else
        println("variable not null")

//14.Create a program to determine the day of the week based on a given date


//15.Write a program to classify a given number as positive, negative, or zero
    val number9: Int = -2
    if (number9 > 0) {
        println("Ədəd müsbətdir")
    } else if (number9 < 0) {
        println("Ədəd mənfidir")
    } else {
        println("Ədəd sıfırdır")
    }
}












