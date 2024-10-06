package com.example.androidprojecttest1.activityapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.databinding.ActivityFacebookBinding

class FacebookActivity : AppCompatActivity() {
    private var binding: ActivityFacebookBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFacebookBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.BackFacebookButton?.setOnClickListener {
            finish() // Current activity is finished and returns to the previous one
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
        }
        facebookText()
    }

    private fun facebookText() {
        binding?.facebookText?.setOnClickListener {
            openUrl("https://www.facebook.com")
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