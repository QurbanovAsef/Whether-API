package com.example.androidprojecttest1.lesson27

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.androidprojecttest1.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class Lesson27Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson27)





        lifecycleScope.launch {
//            delay(2000)
            val name=async {
                printCoroutineText("text1")
                delay(3000)
                "asef"
            }
            val surname=async {
                printCoroutineText("text2")
                delay(6000)
                "asef"
            }
            printSimpleText("name=${name.await()},surname=${surname.await()}" )
            printCoroutineText("text2")
        }

    }

    private suspend fun printCoroutineText(text: String) {
        Log.d("Lesson27ActivityTAG", "coroutineText=$text")
    }

    private fun printSimpleText(text: String) {
        Log.d("Lesson27ActivityTAG", "simpleText=$text")
    }
}

