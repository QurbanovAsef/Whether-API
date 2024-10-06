package com.example.androidprojecttest1

fun main() {
    val person = Person(name = "Kamran", age = 14) //1
    println("--------1")
    println("name:${person.name}")
    println("age:${person.age}")

    val Mercedes = Car(brand = "Mercedes", model = "c200", year = 1998) //2
    println("--------2")
    println("brand:${Mercedes.brand}")
    println("model:${Mercedes.model}")
    println("year:${Mercedes.year}")
    //Mercedes.startYear("14:00-da")

    val rectangle = Rectangle(length = 25, width = 40) //3
    println("--------3")
    println("length:${rectangle.length}")
    println("width:${rectangle.width}")

    val book = Book("1984", "George Orwell", 328) //4
    println("--------4")
    println("Title: ${book.title}")
    println("Author: ${book.author}")
    println("Pages: ${book.pages}")

    val student = Student("Kamran", 14, "AZE-2BY3JRG") //5
    println("--------5")
    println("Name: ${student.name1}")
    println("Age: ${student.age}")
    println("Student ID: ${student.studentId}")

    val person2 = Person2(name2 = "azim", age2 = 27) //6
    println("--------6")
    println("name:${person2.name2}")
    println("name:${person2.age2}")

    val book2 = Book2(title2 = "Viktor.H.", author2 = "island Han") //7
    println("--------7")
    println("Title: ${book2.title2}")
    println("Author2:${book2.author2}")

    val car2 = Car2(brand2 = "BMW", model2 = "i5 M60") //8
    println("--------8")
    println("brand=${car2.brand2}")
    println("model2=${car2.model2}")

    val rectangle2 = Rectangle2(20.0, 40.0) //9
    println("--------9")
    println("length3= ${rectangle2.length3}")
    println("rectangle2= ${rectangle2.width2}")

    val student2 = Student2("Kenan", "AZE-415632") //10
    println("--------10")
    println("name:${student2.name}")
    println("studentId:${student.studentId}")

    val calculator = Calculator() //11
    val a = 40.0
    val b = 20.0
    println("--------11")
    println("sum:${calculator.add(a, b)}")
    println("subtract:${calculator.subtract(a, b)}")
    println("multiply:${calculator.multiply(a, b)}")
    println("divide:${calculator.divide(a, b)}")

//12
    println("--------12")


    val circle = Circle() //13
    val r = 10.0
    println("--------13")
    println("Circle area:${circle.area(r).toInt()}")
    println("Circle circumference:${circle.circumference(r).toInt()}")

    val rectangle3 = Rectangle3() //14
    val l = 10
    val w = 20
    println("--------14")
    println("area:${rectangle3.area(l, w)}")
    println("perimeter:${rectangle3.perimeter(l, w)}")

    val triangle=Triangle()
    val b1=10
    val h=20
    val a4=10
    val b4=10
    val c4=10
    println("--------15")
    println("area:${triangle.area(b1, h)}")
    println("perimeter:${triangle.perimeter(a4, b4, c4)}")
}


//1.Create a class Person with properties name and age. Implement a primary constructor to initialize these properties.
class Person(var name: String, var age: Int) {}

//2.Create a class Car with properties brand, model, and year. Implement a primary constructor to initialize these properties.
class Car(var brand: String, var model: String, var year: Int) {
//    fun startYear(startYear: String) {
//    println("$brand $model model $year ci il saat $startYear buraxlıldı")
//    }
}

//3.Create a class Rectangle with properties length and width. Implement a primary constructor to initialize these properties.
class Rectangle(val length: Int, val width: Int) {}

//4.Create a class Book with properties title, author, and pages. Implement a primary constructor to initialize these properties.
class Book(val title: String, val author: String, val pages: Int) {}

//5.Create a class Student with properties name, age, and studentId. Implement a primary constructor to initialize these properties.
class Student(val name1: String, val age: Int, val studentId: String)

//6.Create a class Person with a primary constructor that takes a name property. Implement a secondary constructor that takes the
//name and age properties.
class Person2(var name2: String) {
    var age2: Int? = null

    constructor(name2: String, age2: Int) : this(name2) {
        this.age2 = age2
    }
}
//7Create a class Book2 with a primary constructor that takes a title property. Implement a secondary constructor that takes the title
//and author properties.

class Book2(val title2: String) {
    var author2: String? = null

    constructor(title2: String, author2: String) : this(title2) {
        this.author2 = author2
    }
}

//8.Create a class Car2 with a primary constructor that takes a brand property. Implement a secondary constructor that takes the
//brand and model properties.

class Car2(var brand2: String) {
    var model2: String? = null

    constructor(brand2: String, model2: String) : this(model2) {
        this.model2 = model2
    }

}

//9Create a class Rectangle2 with a primary constructor that takes a length property. Implement a secondary constructor that takes
//the length and width properties.

class Rectangle2(var length3: Double) {
    var width2: Double? = null

    constructor (length3: Double, width2: Double) : this(width2) {
        this.width2 = width2
    }
}
//10.Create a class Student2 with a primary constructor that takes a name property. Implement a secondary constructor that takes the
//name and studentId properties.

class Student2(val name: String) {
    var studentId: String? = null

    constructor(name: String, studentId: String) : this(name) {
        this.studentId = studentId
    }
}

//11Create a Calculator class with functions add, subtract, multiply, and divide that perform the corresponding mathematical
//operations.

class Calculator() {

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {

        return a / b
    }
}

//12.Create a CurrencyConverter class with functions convertToUSD and convertToEUR to convert currency values.
//?



//13. Create a Circle class that represents a circle. Implement functions to calculate the area and circumference of the circle.

class Circle() {
    val pi = Math.PI
    fun area(r: Double): Double {
        return pi * r * r * r
    }

    fun circumference(r: Double): Double {
        return 2 * pi * r
    }
}

//14.Create a Rectangle3 class that represents a rectangle. Implement functions to calculate the area and perimeter of the rectangle.
class Rectangle3() {
    fun perimeter(l: Int, w: Int): Int {
        return 2 * (l + w)
    }

    fun area(l: Int, w: Int): Int {
        return l * w


    }
}

//15. Create a Triangle class that represents a triangle. Implement functions to calculate the area and perimeter of the triangle.
class Triangle() {

    fun area(b1: Int, h: Int): Int {
        return (b1 * h) / 2
    }
    fun perimeter(a4: Int, b4: Int, c4: Int): Int {
        return a4 + b4 + c4
    }


}