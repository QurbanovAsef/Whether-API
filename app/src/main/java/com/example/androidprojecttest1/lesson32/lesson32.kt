package com.example.androidprojecttest1.lesson32

class Address(  )

class Student(      private var address: Address,)

class Teacher(    private val address: Address, )

class University(
    private val address: Address,
    private val student: Student,
    private val teacher: Teacher
){
    fun printStatus(){

    }
}
