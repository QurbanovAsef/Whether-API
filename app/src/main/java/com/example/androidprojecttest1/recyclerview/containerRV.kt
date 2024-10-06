package com.example.androidprojecttest1.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.R

class containerRV : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_container_rv)
        supportFragmentManager.beginTransaction()
            .replace(R.id.listContainer, ListFragment())
            .commit()
    }
}
