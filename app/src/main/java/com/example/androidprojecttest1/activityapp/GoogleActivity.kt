package com.example.androidprojecttest1.activityapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.databinding.ActivityGoogleBinding

class GoogleActivity : AppCompatActivity() {
    private var binding: ActivityGoogleBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGoogleBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.BackGoogleButton?.setOnClickListener {
            finish() // Current activity is finished and returns to the previous one
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
        }
        googleText()
    }

    private fun googleText() {
        binding?.GoogleText?.setOnClickListener {
            openUrl("https://www.google.com")
        }
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
