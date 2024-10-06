package com.example.androidprojecttest1

fun main() {
//    val number: Int? = null
//    if (number != null) {
//        println(number)
//    } else {
//        println(null)
//    }
//
//    var aray = arrayOf("cut", "dog", 1, 2.2)
//    println(aray[2])
//
//    var size = aray.size
//    println(size)
//
//    val araylist = ArrayList<Int>()
//    araylist.add(1)
//    araylist.add(2)
//    araylist.add(3)
//    println(araylist[0])
//    println(araylist.size)

    val araylistof = arrayListOf<String>("alk", "b", "o")
    araylistof.add("hhh")
    araylistof.add(0, "aaaajja")
    araylistof[2] = "y"
    println(araylistof[2])  // araylist ofda morteze icnde yazmaq olr ama array listde yox
    val s = araylistof[0].uppercase()

    println(s)


    var nukl: String? = null
//    println(nukl?.length ?: "bura nuldu") // elvis operatoru deyrki yeni bura heqiqetende nuldursa mene ekranda bunu cap ele


    if (nukl==null) println("kkkk")

    else "nul deyl"


}
