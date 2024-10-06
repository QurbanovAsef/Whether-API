package com.example.androidprojecttest1.activityapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.databinding.ActivityAccountCreated2Binding

class AccountCreated : AppCompatActivity() {
    private var binding: ActivityAccountCreated2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountCreated2Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        val email = intent.getStringExtra("Email")
        val password = intent.getStringExtra("Password")

        binding?.EmailSingIn?.text = email
        binding?.testPassword?.text = password

        binding?.backButton?.setOnClickListener {
            finish() // Current activity is finished and returns to the previous one
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
