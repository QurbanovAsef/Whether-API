package com.example.androidprojecttest1

fun main() {
    // Tapsiriq 1
    /* Declare two integer variables "num1" and "num2" with values 5 and 10, respectively. Print the
    sum of these two variables.*/

    // nümunə 1
    val num1: Int = 5
    val num2: Int = 10
    println(num1 + num2)

    /* nümunə 2
    val num1 = 5
    val num2 = 10
    println(num1+num2)

       nümunə 3
    val num1 = 5
    val num2 = 10
    println("$num1+$num2=${num1 + num2} ")
    */

    // Tapsiriq 2
    /* Declare two floating-point variables "pi" and "radius" with values 3.14 and 5.0, respectively.
     Calculate the area of a circle with the given radius and print the result.*/

    //nümunə 1
    val pi = 3.14f
    var r = 5.0f
    var S = pi * r * r
    println(S)

    /* nümunə 2
    val pi: Float = 3.14f
    var r: Float = 5.0f
    println("S=$pi*$r*$r=${pi * r * r}")
    */

    // Tapsiriq 3
    //Declare a character variable "grade" and assign the value 'A' to it. Print the grade.
    //grade hissesini tam anlamadim

    val grade: Char = 'A'
    println(grade)

    // Tapsiriq 4
    /*Declare a boolean variable "isSunny" and assign the value true to it. Print whether it is sunny or
    not.*/
    /* ("||" ve ya demekdir eger her hansisa biri duzdurse "true" verecek her ikiside olmasi sert deyl)
       ("&&" ve demekdir her iki beraberlik dogrudursa "true" gelir)
       (! tersini gosterir) */

    val isSunny: Boolean = true
    val notSunny: Boolean = false
    println(isSunny || notSunny)
    println(isSunny && notSunny)
    println(!isSunny)

    // Tapsiriq 5
    /*Declare a variable "population" and assign the value 1000000 without specifying its type. The
    Kotlin compiler should automatically infer the type. Print the population.*/

    val population = 1000000
    println(population)
    println("Population=$population")

    // Tapsiriq 6
    /*Declare a constant "PI" with the value 3.14159. Calculate the circumference of a circle with a
    radius of 5 using the constant. Print the circumference.*/
    // yuxardada pi ve r qeyd edilib bu halda PI ve r1 yazdim yorum setrine  eks halda error verir

    val PI = 3.14159
    val r1 = 5
    val circumference = 2 * PI * r1  // circumference =L
    println("circumference=$circumference")

    // tapsiriq 7
    // Declare an integer variable "num" with the value 10. Convert it to a double and print the result.

    var num: Int = 10
    var Double = num.toDouble()
    println(Double)

    // Tapsiriq 8
    // Declare two integer numbers and calculate their remainder when divided. Print the result.

    var u = 18
    u %= 4
    println(u)
    //qaliq 2

    var a: Int = 15
    var b: Int = 7
    println(a % b)
    //qaliq 1

    var x: Float = 12f
    var y: Float = 3.4f
    println(x % y)
    //qaliq 1.7999997


    // Tapsiriq 9
    // Declare the length and width of a rectangle. Calculate its area and print the result.

    var a1 = 4
    var b1 = 6
    var s = a1 * b1
    println("s=$s")

    // Tapsiriq 10
    // Declare a distance in kilometers and convert it to miles. Print the result.
    //1km=0.621371mil
    //150 km 150*0.621371

    var Km = 150
    var Mile = Km * 0.621371
    println(Mile)

    // Tapsiriq 11
    //Declare the base and height of a triangle from the user. Calculate its area and print the result.

    var b2: Int = 10
    var h: Int = 15
    var S2 = (b2 * h) / 2
    println(S2)

    // Tapsiriq 12 ve tapsiriq 9 eynidir
    //Declare the length and width of a rectangle. Calculate its area and print the result.

    // Tapsiriq 13
    //Declare the number of minutes and convert it to seconds. Print the result.

    val minutes = 10
    val seconds = 60 * minutes
    println(seconds)

    // Tapsiriq 14
    // Declare a number and calculate its square and cube using exponents. Print the results.

    var v = 5
    var square = v * v
    var cube = v * v * v
    println("square=$square")
    println("cube=$cube")

    // Tapsiriq 15
    /*Declare two double numbers and perform addition, subtraction, multiplication, and division
    operations. Print the results.*/

    var z = 9.9
    var m = 3.0
    val addition = z + m
    val subtraction = z - m
    val multiplication =
        z * m // vurma ve bolme mende sual yarandi neticede alinan 000000000 lara gore
    val division =
        z / m      // vurma ve bolme mende sual yarandi neticede alinan 000000000 lara gore
    println(addition)
    println(subtraction)
    println(multiplication)
    println(division)

    //Tapsiriq 16
    // Declare the number of minutes and convert it to hours and days. Print the result.

    val minutes1 = 1440 // min bu olmalidir ki, 1 gun olsun eks halda 0
    val hours = minutes1 / 60
    val days = minutes1 / (60 * 24)
    println(hours)
    println(days)

    //Tapsiriq 17
    // Declare three double numbers and calculate their average. Print the result.

    val v3 = 4.0
    val v4 = 6.0
    val v5 = 8.0
    val o = (v3 + v4 + v5) / 3  // (a+b+c)/n
    println(o)

    //Tapsiriq 18
    // Declare the birth year and the current year. Calculate and print the user's age.

    val birthyear: Int = 1998
    val currentyear: Int = 2024
    val age = currentyear - birthyear
    println("age=$age")

    //Tapsiriq 19
    //Declare two integer numbers and swap their values without using a third variable. Print the updated values.

    var nomre1 = 25
    var nomre2 = 15

    // nomre1 +=5
    // nomre2 +=10

    nomre1 = nomre2 + nomre1  // * - /
    nomre2 = nomre1++
    //nomre2=nomre1-nomre2

    println(nomre1)
    println(nomre2)
    /*
        var j = 6
        var k = 8
        j = 18
        k = 24
        println(j)
        println(k)
    */

    //Tapsiriq 20
    //Declare an integer number and perform increment and decrement operations. Print the results.
    var MYint = 6
    var increment: Int = ++MYint //7 oldu yadda saxladi
    var decrement: Int = --MYint //7 den 1 cxdi 6 qaldi

    // var decrement:Int= MYint ++ bu nye alnmadi?

    println(increment)
    println(decrement)


}