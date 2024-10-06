package com.example.androidprojecttest1

fun main() {
}

//
//    val manager = Manager("Kamran", 2000.0, 500.0) //1
//    val regularEmployee = RegularEmployee("Nermin", 1000.0)
//    println("--------------1")
//    println("Manager:${manager.name}\n Salary:${manager.salary}\n Bonus:${manager.bonus}")
//    println("--------------")
//    println("RegularEmployee:${regularEmployee.name}\n Salary:${manager.salary}")
//
//
//    val laptop = Laptop("MyLaptop") //2
//    println("--------------2")
//    laptop.printPowerStatus()
//    laptop.turnOn()
//    laptop.printPowerStatus()
//
//
//    val circle1 = Circle1(10.0) //3
//    println("--------------3")
//    println("circle1:${circle1.calculateArea().toInt()}")
//    println("circle1:${circle1.calculatePerimeter().toInt()}")
//    println("--------------")
//
//    val rectangle1 = Rectangle1(10.0, 20.0)
//    println("rectangle1:${rectangle1.calculateArea().toInt()}")
//    println("rectangle1:${rectangle1.calculatePerimeter().toInt()}")
//    println("--------------")
//
//    val triangle1 = Triangle1(10.0, 10.0, 10.0)
//    println("Triangle1:${triangle1.calculateArea()}")
//    println("Triangle1:${triangle1.calculatePerimeter()}")
//    println("--------------")
//
//    //4
//    //5
//    //6
//    //7
//
//    val button = Button()
//    button.onClick()
//
//    val calculator = Calculator0()
//    println(calculator.calculate(4.0, 5.0, '+'))
//}
//
//
////1.Create a class Employee with properties name and salary. Derive classes Manager and RegularEmployee from Employee.
////Managers have an additional property bonus that affects their total salary.
//open class Employee(var name: String, var salary: Double) {
//    open fun totalSalary(): Double = salary
//}
//
//class Manager(name: String, salary: Double, var bonus: Double) : Employee(name, salary) {
//    override fun totalSalary(): Double = salary + bonus
//}
//
//class RegularEmployee(name: String, salary: Double) : Employee(name, salary)
//
//
////2.Create an abstract class Device with properties name and powerOn. Implement classes Laptop and TV that extend Device
////and provide concrete implementations for turnOn().
//
//abstract class Device {
//    abstract val name: String
//    abstract var powerOn: Boolean
//    abstract fun turnOn()
//}
//
//class Laptop(override val name: String) : Device() {
//
//    override var powerOn: Boolean = false
//
//    override fun turnOn() {
//        powerOn = true
//    }
//
//    fun printPowerStatus() = println("$name:  $powerOn")
//}
//
////class Tv(override val name: String) : Device() {}
//
////3.Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Implement classes Circle
////and Rectangle that extend Shape and provide concrete implementations for the abstract methods. Implement a class
////Triangle that extends Shape and overrides the calculateArea() and calculatePerimeter() methods to handle
////triangle-specific calculations.
//
//abstract class Shape {
//    abstract fun calculateArea(): Double
//    abstract fun calculatePerimeter(): Double
//}
//
//class Circle1(private val r: Double) : Shape() {
//    private val pi = Math.PI
//    override fun calculateArea(): Double = pi * r * r
//    override fun calculatePerimeter(): Double = 2 * pi * r
//}
//
//class Rectangle1(private val a: Double, private val b: Double) : Shape() {
//    override fun calculatePerimeter(): Double = 2 * (a + b)
//    override fun calculateArea(): Double = a * b
//}
//
//class Triangle1(
//    private val a1: Double,
//    private val b1: Double,
//    private val c1: Double,
//) : Shape() {
//    override fun calculateArea(): Double {
//        val s = calculatePerimeter() / 2
//        return sqrt(s * (s - a1) * (s - b1) * (s - c1))
//    }
//
//    override fun calculatePerimeter(): Double = a1 + b1 + c1
//}
////4.Create an abstract class MobileDevice with properties model and storageCapacity. Implement classes Phone and Tablet
////that extend MobileDevice and override the turnOn() method.
//
//abstract class MobileDevice {
//    abstract val model: String
//    abstract val storageCapacity: Int
//    open fun turnOn() {}
//}
//
//class Phone(override val model: String, override val storageCapacity: Int) : MobileDevice() {
//    override fun turnOn() {
//        super.turnOn()
//    }
//}
////tamamlaya bilmedim diger sualda oldugu kimi sanki sualin qoyulusunde nese noqsan var
//
////5.Create a class Person with private properties name and age, and public methods to get and set these properties.
//class Person1(private var name: String, private var age: Int) {
//    fun getName(): String {
//        return name
//    }
//
//    fun setName(newName: String) {
//        name = newName
//    }
//
//    fun getAge(): Int {
//        return age
//    }
//
//    fun setAge(newAge: Int) {
//        age = newAge
//    }
//}
////capa nece vermeli?
//
////6. Implement a base class Animal with a method makeSound(), and derive classes Dog and Cat that override this method.
//open class Animal() {
//    open fun makeSound() {
//        println("")
//    }
//
//    class Dog : Animal() {
//        override fun makeSound() {
//            println("hav")
//        }
//
//    }
//
//    class Cat : Animal() {
//
//        override fun makeSound() {
//            println("miau")
//        }
//    }
//}
//
////7.Create an interface Vehicle with methods startEngine() and stopEngine(). Implement it in classes Car and Motorcycle.
//interface Vehicle {
//    fun startEngine()
//    fun stopEngine()
//}
//
//class Car0 : Vehicle {
//    override fun startEngine() {
//        println("abc")
//    }
//
//    override fun stopEngine() {
//        println("efj")
//    }
//}
//
//class Motorcycle : Vehicle {
//    override fun startEngine() {
//        println("abc")
//    }
//
//    override fun stopEngine() {
//        println("efj")
//    }
//}
//
////8.Define an interface Playable with a method play(). Implement this interface in classes MusicPlayer and VideoPlayer.
//interface Playable {
//    fun play()
//}
//
//class MusicPlayer : Playable {
//    override fun play() {
//        println("MusicPlayer")
//    }
//
//    class VideoPlayer : Playable {
//        override fun play() {
//            println("VideoPlayer")
//        }
//
//    }
//}
//
////9.Create a class Calculator with private methods for basic operations (add, subtract) and a public method calculate that uses
////these private methods.
//class Calculator0 {
//
//    private fun add(a: Double, b: Double): Double {
//        return a + b
//    }
//
//    private fun subtract(a: Double, b: Double): Double {
//        return a - b
//    }
//
//    fun calculate(a: Double, b: Double, char: Char): Double {
//        return if (char == '+') add(a, b) else subtract(a, b)
//    }
//}
//
////10.Create an interface Clickable with a method onClick(). Implement this interface in a class Button.
//interface Clickable {
//    fun onClick()
//}
//
//class Button : Clickable {
//    override fun onClick() {
//        println("clik olundu")
//    }
//}
//
//
////print hissei ile bagli xeyli
//// sual yarandi demek olarki tapsiriqlar yarmciq qaldi print hissesi
//
// class Calculate() {
//     fun add(a: Int, b: Int): Int {
//         return a + b
//     }
//
//     fun add(a: Int, b: Int, c: Int): Int {
//         return a + b + c
//     }
// }
//
class Book1(val title: String, val author: String, val pages: Int) {

    fun read ():String{
        return when (pages){
            in 0..100-> "+"
            else->"-"
        }
    }
}

//class Person {
//    val name: String
//    var age: Int
//    var occupation: String? = null
//
//    // Primary Constructor
//    constructor(name: String, age: Int) {
//        this.name = name
//        this.age = age
//    }
//
//    // Secondary Constructor
//    constructor(name: String, age: Int, occupation: String) : this(name, age) {
//        this.occupation = occupation
//    }
//
//    fun introduce() {
//        val occupationInfo = occupation ?: "işsiz"
//        println("Merhaba, benim adım $name ve $age yaşındayım. Ben bir $occupationInfo.")
//    }
//}
//
//fun main() {
//    val person1 = Person("Ahmet", 25)
//    val person2 = Person("Ayşe", 30, "doktor")
//
//    person1.introduce()
//    person2.introduce()
//}




//    protected open fun makeSound bu skilde yazla bilermi?
// data class  nedir

//interface Drivable {
//    fun drive()
//}
//
//interface Maintainable {
//    fun maintain()
//}
//
//class Car : Drivable, Maintainable {
//    override fun drive() {
//        println("Araba sürülüyor.")
//    }
//
//    override fun maintain() {
//        println("Araba bakımda.")
//    }
//}
//
//fun main() {
//    val car = Car()
//    car.drive()
//    car.maintain() }





