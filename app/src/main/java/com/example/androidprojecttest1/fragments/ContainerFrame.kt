package com.example.androidprojecttest1.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.R
import com.example.androidprojecttest1.databinding.ActivityContainerFrameBinding

class ContainerFrame : AppCompatActivity() {
    private var binding: ActivityContainerFrameBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContainerFrameBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val firstFragment = FirstFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, firstFragment).commit()
    }
}