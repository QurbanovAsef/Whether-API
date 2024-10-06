package com.example.androidprojecttest1

fun main() {
    // Tapsiriq 1
    //Declare a string variable named "name" with the value "kate". Print the length of this string.

    var name = "kate"
    println(name.length)

    // Tapsiriq 2
    //Create a string variable containing your full name. Print each character of your name on a separate line.
    var name1 = "kamran"
    println(name1[3])
    println(name1[name1.length - 1])

    // Tapsiriq 3
    /*Declare two string variables, "firstName" and "lastName", and initialize them with your first and last name
    respectively. Concatenate them and print the full name.*/
    var firstName = "mahammad"
    var lastName = "quliyev"
    println("$firstName $lastName")

    // Tapsiriq 4
    //Create a string variable containing a sentence. Print the sentence in uppercase.
    var sentence = "the weather is very hot today"
    println(sentence.uppercase())

    // Tapsiriq 5
    //Declare a string variable containing a sentence with whitespace at the beginning and end. Trim the
    //whitespace and print the trimmed sentence.
    var sentence1 = "           the weather is very hot today           "
    println(sentence1.trim())

    // Tapsiriq 6
    //Declare a string variable containing a sentence. Use the contains() function to check if the sentence contains a specific word.
    val sentence2 = "bu cumlede kotlin sozu varmi"
    println(sentence2.contains("kotlin"))

    // Tapsiriq 7
    //Declare a string variable containing a sentence. Use the substring() function to extract a specific portion of the sentence and print it.
    val sentence3 =
        "bu cumledeki bezi sozleri cap et"  //cumle daxilinde her hansi bir sozun uzunlugu nece cap olunur
    val sentence4 = sentence3.substring(3, 12)
    println(sentence4)

    // Tapsiriq 8
    //Declare a string variable containing a sentence. Replace a specific word in the sentence with another word and print the modified sentence.

    val sentence5 = "ekranda hello  cap ele"
    println(sentence5.replace("hello", "kotlin1"))

    // Tapsiriq 9
    //Declare an array of strings containing the names of your favorite fruits. Print each fruit name on a separate line.
    val Myfavoritefruits = arrayOf("alma", "armud", "nar", "heyva", "banan")
    println(Myfavoritefruits[0])
    println(Myfavoritefruits[1])
    println(Myfavoritefruits[2])
    println(Myfavoritefruits[3])
    println(Myfavoritefruits[4])





    // Tapsiriq 10
    // Declare an array of integers containing your age in the last five years. Print each age.
    val ages = arrayOf(20, 21, 22, 23, 24)



    // Tapsiriq 11
    //Declare an array of doubles containing the prices of five different items. Print the total price of all items.
    val qiymetler = doubleArrayOf(10.5, 20.0, 15.75, 8.99, 12.25)
     //ede bilmdim




    // Tapsiriq 12
    //Declare an array of doubles representing temperatures. Find the average temperature.
    val temperatur = arrayOf(26.0, 28.0)
    val ortatemperatur = (temperatur[0]+temperatur[1])/temperatur.size      //avarage ?
    println("-------12")
    println(ortatemperatur)


    // Tapsiriq 13
    //13. Declare a nullable string variable and assign it a value of null. Safely print the length of the string (if it's not null).
    //if else deyil?
    val nullolabilen: String? = null
    println(nullolabilen?.length)

    // Tapsiriq 14
    //Declare a nullable string variable and assign it a value. Use the !! operator to force unwrap the nullable
    //value and print its length.
    //Operator !!null edilə bilən dəyəri zorla açmaq üçün istifadə olunur. Bu, dəyərin sıfır olmadığını təsdiq edir
    var name12: String? = "ATL Academy"
    var name13 = name12!!.length   //cap hisseni tam basa dusmedim
    println("-----14")
    println(name13)

    // Tapsiriq 15
    //Declare a nullable String variable and assign it a value of "123". Convert it to an integer using toInt() and print the result.
    var text1: String? = "123"
    var text2 = text1?.toInt()
    println(text2)

    // Tapsiriq 16
    //Declare a nullable Double variable and assign it a value of 3.14. Convert it to a String using toString() and
    //print the result.
    var text: Double? = 3.14
    var text3 = text?.toString()
    println(text3)

    // Tapsiriq 17
    //Declare a nullable Char variable and assign it a value of 'A'. Convert it to a String using toString() and print
    //the result.
    var text5: Char? = 'A'
    var text6 = text5?.toString()
    println(text6)

    // Tapsiriq 18
    //Declare a nullable Long variable and assign it a value of 1000000. Convert it to a String using toString() and
    //print the result.
    var text7: Long? = 1000000
    var text8 = text7?.toString()
    println(text8)

    // Tapsiriq 19
    //Declare a nullable String variable and assign it a value of "true". Convert it to a Boolean using toBoolean()
    //and print the result.
    var text9: String? = "true"
    var text10 = text9?.toBoolean()
    println(text10)

    // Tapsiriq 20
    //Declare a nullable Boolean variable and assign it a value of true. Convert it to a String using toString() and
    //then back to a Boolean using toBoolean() and print the result.
    var text11: Boolean? = true
    var text12 = text11?.toString()
    var text13 = text12.toBoolean()
    println(text12)
    println(text13)


}