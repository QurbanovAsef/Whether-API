package com.example.androidprojecttest1

import android.graphics.Color

fun main() {
    println("---------2") //2
    val book3 = Book3("Mələk", "Elxan Zeynallı", 110)
    val newBook = book3.copy("1-ci addım", "Elxan Zeynallı", 110)
    println(book3)
    println(newBook)

    println("---------3") //3
    val student9 = Student9("ali", 47)
    val student10 = Student9("ali", 47)
    val equals = student9.equals(student10)
    println(equals)

    println("---------4") //4
    var rectangle = Rectangle9(20.0, 10.0)
    println(rectangle.area())

    println("---------5") //5
    val address = Address("U.H.k", "baku")
    val user = User("Emin ", address)
    println(user.name)
    println(user.address.street)
    println(user.address.city)

//    println("---------6") //6
//    val successResponse = Response.Success(" successfully")
//    val failureResponse = Response.Failure("Error ")
//    //?

    println("---------7")
    val circle = Shape.Circle(10.0)
    println(circle.area().toInt())
    println(circle.perimeter().toInt())

    println("---------8")
    val textMessage = Message.TextMessage("textMessage", "asaf")
    textMessage.send()
    val imageMessage = Message.ImageMessage("ImageMessage", "asaf")
    imageMessage.send()

    println("---------9")
    val screenState = ScreenState.Success("Data loaded successfully")
    screenState.function(screenState)

    println("---------10")
    val addition = Operation.Addition(6, 5)
    val subtraction = Operation.Subtraction(8, 5)
    println(addition.operation())
    println(subtraction.operation())

    println("---------11")
    val color = Color.BLUE
    //?????????

    println("---------12")
    println(Season.OTHERS.isCold())
    println(Season.WINTER.isCold())

    println("---------13")
    val signal = Signal.RED

    val action = when (signal) {
        Signal.RED -> "RED"
        Signal.YELLOW -> " YELLOW"
        Signal.GREEN -> "GREEN"
    }

    println(action)
}


//1.Create a data class Person with properties name and age.
data class Person3(var name: String, var age: Int) {}

//2.Create a data class Book with properties title, author, and year. Use the copy function to create a new book with the same author but a different title.
data class Book3(val title: String, val author: String, val year: Int) {}

//3.Define a data class Student with properties id and name. Create two instances with the same properties and check for equality.
data class Student9(var name: String, var id: Int) {}

//4.Implement a data class Rectangle with properties width and height, and a method area() that returns the area of the rectangle.
data class Rectangle9(var with: Double, var height: Double) {
    fun area(): Double {
        return with * height
    }
}

//5.Create a data class Address with properties street and city. Create another data class User with properties name and address of type Address.
data class Address(val street: String, val city: String) {}
data class User(val name: String, val address: Address) //address of type Address.

//6.Create a sealed class Response with subclasses Success and Failure. Use a when expression to handle each subclass.
//sealed class Response {
//    class Success(val data: String) : Response() {}
//    class Failure(val error: String) : Response() {}
//
//    fun handleResponse(response: Response) {
//        when (response) {
//            is Success -> println(response.data)
//
//            is Failure -> println(response.error)
//
//        }
//    }
//}

//7.Create a sealed class Shape with subclasses Circle and Rectangle. Add properties and methods relevant to each shape.
sealed class Shape {
    abstract fun area(): Double
    abstract fun perimeter(): Double

    class Circle(val radius: Double) : Shape() {
        override fun area(): Double = Math.PI * radius * radius
        override fun perimeter(): Double = 2 * Math.PI * radius
    }

    class Rectangle(val width: Double, val height: Double) : Shape() {
        override fun area(): Double = width * height
        override fun perimeter(): Double = 2 * (width + height)
    }

}

//8.Implement a sealed class Message with subclasses TextMessage and ImageMessage, each with a method send().
sealed class Message {

    abstract fun send()
    class TextMessage(val text: String, val name: String) : Message() {
        override fun send() {
            println("send text message $name,$text")
        }
    }

    class ImageMessage(val imageText: String, val name: String) : Message() {
        override fun send() {
            println("send Image message $name,$imageText")
        }

    }
}

//9.Create a sealed class ScreenState with subclasses Loading, Success, and Error, and use it to manage UI state in a function.
sealed class ScreenState {
    data class Success(val data: String) : ScreenState()
    data class Error(val message: String) : ScreenState()
    data class Loading(val loading: String) : ScreenState()

    fun function(screenState: ScreenState) {
        when (screenState) {
            is Success -> println(screenState.data)
            is Error -> println(screenState.message)
            is Loading -> println(screenState.loading)
        }
    }

}

//10.Define a sealed class Operation with subclasses Addition and Subtraction that take two integers as parameters.
sealed class Operation {
    abstract val a: Int
    abstract val b: Int
    abstract fun operation(): Int
    class Addition(override val a: Int, override val b: Int) : Operation() {
        override fun operation(): Int = a + b
    }

    class Subtraction(override val a: Int, override val b: Int) : Operation() {
        override fun operation(): Int = a - b

    }
}


//11.Define an enum class Color with properties rgb and description.
//    enum class Color(val rgb: Int, val description: String) {
//        BLUE(0x0000FF, " color sky."),
//        GREEN(0x00FF00, "color nature");
//
//        fun gedHexCode(): String {
//            return String.format("#%06X", rgb)
//        }
//    }

//12.Implement an enum class Season with a method isCold() that returns true for winter and false for other seasons.
enum class Season() {
    WINTER, OTHERS;

    fun isCold(): Boolean {
        return this == WINTER
    }
}

//13.Create an enum class Signal with constants RED, YELLOW, GREEN. Use it in a when expression.
enum class Signal {
    RED, YELLOW, GREEN
}
//14.Implement an enum class Currency with properties symbol and code.
enum class Currency(val symbol:String,val code:String )
//15.Create a class Computer with a nested class Processor that prints a message.