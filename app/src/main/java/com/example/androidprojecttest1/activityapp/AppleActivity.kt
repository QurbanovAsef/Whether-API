package com.example.androidprojecttest1.activityapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.databinding.ActivityAppleBinding

class AppleActivity : AppCompatActivity() {
    private var binding: ActivityAppleBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAppleBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.BackAppleButton?.setOnClickListener {
            finish() // Current activity is finished and returns to the previous one
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
        }
     appleText()
    }

    private fun appleText() {
        binding?.appleText?.setOnClickListener {
            openUrl("https://www.apple.com")
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