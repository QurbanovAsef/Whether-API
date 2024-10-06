//package com.example.androidprojecttest1.lesson32
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.flow.flowOf
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//@HiltViewModel
//class Lesson32VM @Inject constructor(
//    private val university: University
//) : ViewModel() {
//
//    fun getUniversityInfo(): University {
//
//        viewModelScope.launch {
//
//            flowOf(1, 2, 3).collect { element ->
//                println("element=$element")
//            }
//        }
//
//        return university
//    }
//}