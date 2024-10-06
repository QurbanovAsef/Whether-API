package com.example.androidprojecttest1.kotlin

fun main() {
val mercedes=Car34()
val audi=Car34()
val bmw=Car34()

println(mercedes)
}

class Engine(private val power: Int=0, fuel: Int=0) {
    fun startEngine() {
    }
}

class Car34(){
    private val engine= Engine(200,100)
    var power:Int=0
    var fuel:Int=0
    fun startEngine() {
        engine.startEngine()
    }
}
