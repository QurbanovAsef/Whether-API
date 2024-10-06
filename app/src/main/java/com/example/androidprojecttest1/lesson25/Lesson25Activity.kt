package com.example.androidprojecttest1.lesson25

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.R

class Lesson25Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson25)

        supportFragmentManager.beginTransaction()
            .replace(R.id.main, Lesson25Fragment())
            .commit()
    }
}
