package com.example.androidprojecttest1


fun main() {

    println("------1")
    Database.connect() //1

    println("------2")
    Settings.Theme = "BLUE" //2
    Settings.applyTheme()
    println("------3")
    UserSession.userId = "kotlin135"
    UserSession.token = 34
    UserSession.printSessionInfo()

    println("------4")
    SystemDefaults.printDefaults()
    SystemDefaults.setLanguage("English")
    SystemDefaults.setRegion("England")
    SystemDefaults.printDefaults()

    println("------5")
    AppConfig.printConfig()

    println("------6")

    println("------7")
    println(Config.url)
    println(Config.port)

    println("------8")
    val stringRepo: Repository<String> = ImRepository()
    stringRepo.add("ATL")
    stringRepo.add("academy")
    println(stringRepo)
    stringRepo.remove("ATL")
    println(stringRepo)

    println("------9")
    val producer: Producer<String> = Producer("this is product!")
    val funProducer: String = producer.produce()
    println(funProducer)

    println("------10")
    val consumerAny: Consumer<Any> = Consumer()
    consumerAny.consume("this is String")
    consumerAny.consume(45)

    println("------11")
    val result4 = divide(20, 2)
    println(result4)
    val result5 = divide(10, 0)
    println(result5)

    println("------12")
    val exception = exceptions("a", "w")
    println(exception)
    println(".....")

    val divide1: Int? = safeDivide(10, 2)
    println(divide1)
    val divide2: Int? = safeDivide(null, 2)
    println(divide1)

    println("------13")
    try {
        validateName("asef")
        println("ad teyin edildi")
    } catch (e: IllegalArgumentException) {
        println("Xəta: ${e.message}")
    }
    try {
        validateName("")
    } catch (e: IllegalArgumentException) {
        println("Xəta: ${e.message}")
    }

    println("------14")
    processFile("example.txt") // Gözlənilən çıxış: Xəta: Faylı oxumaq mümkün olmadı: example.txt


    println("------15")
    val util = Util()
    // Müxtəlif tiplərdə itemlər çap olunur
    util.printItem(123)        // Int tipi
    util.printItem("Salam")    // String tipi
    util.printItem(45.67)      // Double tipi
    util.printItem(true)       // Boolean tipi
}

//1.Implement a singleton object Database with a method connect() that prints a connection message.
object Database {
    fun connect() {
        println("connection")
    }
}

//2.Create a singleton object Settings that has a property theme and a method applyTheme() that prints the current theme.
object Settings {
    var Theme: String = "EMPTY"
    private var Theme1: String = "GREY"
    fun applyTheme() {
        println("current theme is - $Theme")
        println("current theme is - $Theme1")
    }
}

//3.Define a singleton object UserSession with properties userId and token, and a method printSessionInfo() to display these properties.
object UserSession {
    var userId: String = ""//login
    var token: Int = 0  //key
    fun printSessionInfo() {
        println(userId)
        println(token)
    }
}

//4.Define a singleton object SystemDefaults with default values for language and region, and methods to get and set these values.
object SystemDefaults {
    private var region: String = "Russia"
    private var language: String = "rus"
    fun getRegion(): String {
        return region
    }

    fun setRegion(newRegion: String) {
        region = newRegion
    }

    fun getLanguage(): String {
        return language
    }

    fun setLanguage(newLanguage: String) {
        language = newLanguage
    }

    fun printDefaults() {
        println("Default language: $language")
        println("Default region: $region")
    }
}

//5.Create a singleton object AppConfig with properties appName and version, and a method printConfig().
object AppConfig {
    private var appName: String = "Spotify"
    private var version: Double = 3.11
    fun printConfig() {
        println("appName:$appName")
        println("appVersion:$version")
    }
}

////6.Implement a class SecureToken with a companion object that generates tokens and has a private constructor.
//class SecureToken() {
//    companion object {
//        fun token() {}
//        fun token1() {}
//        fun token2() {}
//
//    }
//}

//7.Define a class Config with a companion object containing properties url and port.
class Config() {
    companion object {
        var url: String = "www.fb.com"
        var port: Int = 4060
    }
}

//8.Define a generic interface Repository<T> with methods add(item: T) and remove(item: T).
interface Repository<T> {
    fun add(item: T)
    fun remove(item: T)
}

class ImRepository<T> : Repository<T> {
    private val items = mutableListOf<T>()
    override fun add(item: T) {
        items.add(item)
    }

    override fun remove(item: T) {
        items.remove(item)
    }

    override fun toString(): String {
        return items.toString()
    }
}


//9.Create a covariant generic class Producer<out T> with a method produce(): T.
class Producer<out T>(private val it: T) {
    fun produce(): T {
        return it
    }
}

//10.Define a contravariant generic class Consumer<in T> with a method consume(item: T).
class Consumer<in T> {
    fun consume(item: T) {
        println("$item")
    }
}

//11.Write a function divide(a: Int, b: Int): Int that handles division by zero using try-catch.
fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) { // 0 a bolme yoxdur ona gore
        println(message = "ArithmeticException xetasi bas verdi") // e.message
        println(e.message)
        2 // defolt olaraq 2
    }
}

//12.Implement a function that handles different types of exceptions (e.g., NumberFormatException, NullPointerException) with
fun exceptions(c: String, d: String): Int {
    return try {
        val num1 = c.toInt()
        val num2 = d.toInt()
        num1 / num2
    } catch (f: NumberFormatException) {
        println("XETA:INt DEYIL")
        1

    }
}

fun safeDivide(f: Int?, g: Int?): Int? {
    return try {
        if (f == null || g == null) {
            throw NullPointerException("Parametrlərdən biri null dəyərdir.")
        }
        f / g
    } catch (e: NullPointerException) {
        println("Xəta: ${e.message}")
        null
        //Xəta: Parametrlərdən biri null dəyərdir. capa bu yazlir
    }
}

//13.Write a function validateName(name: String) that throws an IllegalArgumentException if the name is empty.
fun validateName(name: String) {
    if (name.isEmpty()) {
        throw IllegalArgumentException("mətin daxil et")
    }
}
//14.Define a function readFile that throws an exception, and another function processFile that calls readFile and handles the
//exception.

// readFile funksiyası, fayl oxuma cəhdi zamanı istisna fırladır
fun readFile(fileName: String): String {
    throw Exception("Faylı oxumaq mümkün olmadı: $fileName")//Exception ad deyl xetadir
}

// processFile funksiyası, readFile funksiyasını çağırır və istisnanı idarə edir
fun processFile(fileName: String) {
    try {
        val content = readFile(fileName)
        println("Fayl məzmunu: $content")
    } catch (e: Exception) {
        println("Xəta: ${e.message}")
    }
}


//15.Create a class Util with a generic method printItem(item5: T) that prints the item.

class Util {
    // Generic metod
    fun <T> printItem(item: T) {
        println(item)
    }
}