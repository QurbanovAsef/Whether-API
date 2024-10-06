package com.example.androidprojecttest1


import androidx.core.util.rangeTo

fun main() {
    val numbers = 1..10
    val numbers1 = 1.rangeTo(10)

    val number2 = 1 until 10 //until yazanda hemin ededi daxil etmir
    val number3 = 1.rangeUntil(10)
    println("$numbers")
    println("$numbers1")
    println("$number2")
    println("$number3")

    val range = 1..18 step 3 //step addimlardi range silsile demekdi
    println(range)
    val range1 = 10 downTo 0 step 3 //arxadan basa dogru
    println(range1)

    //contains true false qaytarir range icerisinde bu regem varmi deyr
    //
    //isEmpty() ragne bos oldugunu deyr
    //
    //first birirnci elememti cap edir
    //
    //last sonuncu elementi cap edr
    //
    //step hansi stepnen yaradilib onu deyr
    println(range.contains(7)) // bu ile if eyni seydir if daha lokonik yazilib
    if (4 in range) {
        println("4 in numberrs")
        // println(4 in range) eyni
    }
    println(range.step)
    println(range.first)
    println(range.last)
    println(range.isEmpty())
    println(range.reversed()) // tersine cevirir


    //for
    val range3 = 1.until(5)
    for (b in 1.until(5))
        println(b) // b + * etmek stringe cevirmek ve s emelyatlar etmek olar  b ixdyari dyisen addi
    val range4 = 'a'..'z'
    for (e in 'a'..'f'){
        println("")
        println("-")
        println("- $e")
    }

    val array= arrayOf(10,20,30)
    for (d in array)
        println(d)




    //rturun kodu saxlamaq ucun istifade edilir meslen nuldusa basga srte kecme saxla
    //break hara kimi cap elemek isdremse orda saxlir,mes
    var range66='A'..'Z'

    for (element in range66) {
        println(element)
        if (element == 'M') {
            break
        }
    }
}
//package com.example.androidprojecttest1
//
//fun main() {
//
//    /*  //1.Write a program to find the factorial of a number using a while loop.
//      var number = 5
//      var factorial = 1
//      var i = number
//      while (i >= 1) {
//          factorial *= i //5
//          i--
//          factorial *= i //4
//          i--
//          factorial *= i //3
//          i--
//          factorial *= i //2
//          i--
//          factorial *= i //1
//      }
//      */
//
////2.Implement a program to calculate the sum of all even numbers from 1 to 100 using a for loop and continue.
////    for (e in 100 downTo 1 step 2) {
////        println(e)
////    }
////3.Create a program to count the number of words in a string using a for loop.
//
////4.Write a program to capitalize the first letter of each word in a string using for and if-else.
//// For və if-else istifadə edərək sətirdə hər sözün ilk hərfini böyük hərflə yazmaq üçün proqram yazın.
//
//
////For döngəsindən istifadə edərək sətirdə ən uzun sözü tapmaq üçün proqramı həyata keçirin.
//
////6 Develop a program to remove all digits from a string using a for loop and if-else.
////    val inputString = "bcd123efg456"
////    var result = ""
////    for (char in inputString) {
////        if (!char.isDigit()) { // Check if the character is not a digit
////            result += char // If not a digit, add it to the result string
////        }
////    }
////
////    println("String with digits removed: $result")
////}
////    }
//
//    //12. Implement a program to print all odd numbers between 1 and 50 using a while loop.
//    var index = 1
//    while (index <= 50) {
//        if (index % 2! = 0)
//            println(index)
//    }
//    index++
//}