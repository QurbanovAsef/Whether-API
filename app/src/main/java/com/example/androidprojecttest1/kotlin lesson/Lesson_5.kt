package com.example.androidprojecttest1

import kotlin.math.sqrt

fun main() {
    println(sum(x = 78, y = 22))           //1 number
    println(difference(x1 = 45, y1 = 35))  //2 number
    println(product(x2 = 10, y2 = 20))     //3 number
    println(result(x3 = 60, y3 = 3))       //4 number
    println(result1(x4 = 8, y4 = 3))       //5 number

    val power = power(4.0, 3.0)  //6 number
    println(power)

    val squareRoot1 = squareRoot(x5 = 16.0)    //7 number
    println(squareRoot1.toInt())

    println(factorial(5))  //9number

    println(sum1(4))  //10

    println(rectangleArea(4, 6))   //11

    println(circumference(5.0).toInt()) //12

    println(sphere(2.0).toInt()) //13

    println(rightAngledTriangle(b = 3.0,a=4.0).toInt()) //14

//   val quadraticEquation1=quadraticEquation(2.0,5.0,3.0)  //15

}

//1. Write a function that takes two numbers as arguments and returns their sum.
fun sum(x: Int = 0, y: Int = 0): Int {
    return x + y
}

//2. Write a function that takes two numbers as arguments and returns their difference.
fun difference(x1: Int, y1: Int): Int {
    return x1 - y1
}

//3. Write a function that takes two numbers as arguments and returns their product.
fun product(x2: Int, y2: Int): Int {

    return x2 * y2
}

//4. Write a function that takes two numbers as arguments and returns their division result.
fun result(x3: Int, y3: Int): Int {
    return x3 / y3
}

//5. Write a function that takes two integers as arguments and returns the remainder of their division.
fun result1(x4: Int, y4: Int): Int {
    return x4 % y4
}
//6.Write a function that takes a base and an exponent as arguments and returns the result of the base raised to
//the power of the exponent.

fun power(base: Double, exponent: Double): Double {

    return Math.pow(base, exponent)
}

//7. Write a function that takes a number as an argument and returns its square root.
fun squareRoot(x5: Double): Double {
    return sqrt(x5)
}

//9.Write a function that takes a positive integer as an argument and returns its factorial.
fun factorial(number1: Int): Int { // long ?
    var result = 1 // 0 no
    var index = 0
    while (index < number1) {
        index++
        result *= index
    }
    return result
}

//10 .Write a function that takes a positive integer as an argument and returns the sum of natural numbers up to
//that number.
fun sum1(x7: Int): Int {
//  x7>0 ?
    var sum = 0
    var i = 1
    while (i <= x7) {
        sum += i
        i++
    }
    return sum
}

//11. Write a function that takes the length and width of a rectangle as arguments and returns its area.
fun rectangleArea(x6: Int, x7: Int): Int {
    return x7 * x6
}

//12Write a function that takes the radius of a circle as an argument and returns its circumference.
fun circumference(r: Double): Double {
    val pi = Math.PI
    return  2 * pi * r
}

//13.Write a function that takes the radius of a sphere as an argument and returns its volume.
fun sphere(r1: Double): Double {
    val pi = Math.PI
    return 4.0 / 3.0 * (pi * r1 * r1 * r1)
}

//14 Write a function that takes the lengths of the two sides of a right-angled triangle as arguments and returns
//the length of the hypotenuse.
fun rightAngledTriangle(b: Double, a: Double): Double {
    return sqrt(b*b+a*a)
}

//15 Given a quadratic equation of the form ax^2 + bx + c = 0, where a, b, and c are the coefficients of the
//equation. Using Viet formulas, write a function that finds the sum and product of the roots of the equation.

//fun quadraticEquation(a: Double, b: Double, c: Double): Double {
//
//    val D = b * b - 4 * a * c   //25-24=1 d>0
//
//    if (D > 0) {
//        val x1 = (-b + sqrt(D)) / (2 * a) // (-5 +1)/ 4=-1
//        val x2 = (-b - sqrt(D)) / (2 * a) //-1.25
//        return (x1, x2)
//    } else if (D == 0.0) {
//        val x1 = -b / (2 * a)
//        val x2 = -b / (2 * a)
//    } else {
//        println(" kok yox")
//    }
//
//
//}
