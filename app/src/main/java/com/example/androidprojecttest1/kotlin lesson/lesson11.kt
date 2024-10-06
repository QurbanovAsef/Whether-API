package com.example.androidprojecttest1

fun main() {

//1.Declare a list of integers containing 1, 3, 5, 7. Convert list to a mutable list. Add new element. Remove fist and last element in list. Print list elements
    println("......1")
    val list = listOf(1, 3, 5, 7)
    val mutableListOf = list.toMutableList()
    mutableListOf.add(8)
    println(mutableListOf)
    mutableListOf.removeFirst()
    println(mutableListOf)
    mutableListOf.removeLast()
    println(mutableListOf)
//2.Declare a list of strings with your favorite colors. Convert list to a mutable list. Add new element. Change first element to “Green”. Print list elements
    println("......2")
    val list1 = listOf("red", "blue", "black")
    val mutableListOf1 = list1.toMutableList()
    mutableListOf1.add("grey")
    println(mutableListOf1)
    mutableListOf1.removeAt(0) // first element
    println(mutableListOf1)
    mutableListOf1.removeAt(mutableListOf1.size - 1) // last element
    println(mutableListOf1)
//    for (e in mutableListOf1){
//        println(e)
//    }

//3.Create list of integers. Calculate the average value of all elements in a list.
    println("......3")
    val numbers = listOf(1, 2, 3, 4, 5)
//    println(list3.average())

    var sum = 0.0
    for (number in numbers) {
        sum += number
    }
    val average = sum / numbers.size
    println("average: $average")


//4.Create list of strings with fruits containing “Apple”, “Banana”, “Orange” and second list with “Grapefruit”, “Kiwi”, “Lime”. Add second list to first list
    val fruits1 = mutableListOf("Apple", "banana", "orange")
    val fruits2 = mutableListOf("grapeFruit", "Kiwi", "Lime")
    fruits1.addAll(fruits2)
    println(fruits1)
//5.Create list of integers. Calculate sum of first and last element.
    val intList = listOf(1, 2, 3, 4, 5, 6)
    val sum2 = intList.first() + intList.last()
    println(sum2)

//6.Create set of strings with fruits containing “Apple”, “Banana”, “Orange”. Check if ”Banana" is present in a set
    val fruitSet = setOf("Apple", "banana", "orange")
    val contains = fruitSet.contains("banana")
    println(contains)
//7.Create 2 sets of integers. Check if two sets have any common elements.
    val numberSet1 = setOf(1, 2, 3, 4, 5)
    val numberSet2 = setOf(4, 5, 6, 7, 8)
    val contains2 = numberSet2.containsAll(numberSet1)
    println(contains2)
//8.Create 2 sets of String . Find the intersection of two sets.
    val set1 = setOf("one", "two")
    val set2 = setOf("two", "three", "four")
    val setAll = set2.intersect(set1) // iki coxlugun kesismesini tapir
    println(setAll)


//9.Create set of integers. Remove a specific value from a set.
    val set3 = mutableSetOf(1, 2, 3, 5, 6, 8)
    set3.remove(8)
    println(set3)
//10.Create set of doubles . Remove all elements from a set
    var set4 = mutableSetOf(1.0, 2.0, 3.0)
    set4.clear()
    println(set4)
//Declare a map of strings to integers with names and ages.
//
//Print all keys of a map of cities.
//
//Create a map of integers to strings with key-value pairs.
//
//Print all values of a map of books.
//
//Clear all elements from a mutable map.
//
//16. Update the value of an existing key in a mutable map.
//
//17. Convert a mutable map of students to a read-only map.
//
//18. Create a map of students' names and their corresponding grades.
//
//19. Create a map of words and their lengths from a list.
//
//20. Merge two maps and remove duplicates.
}