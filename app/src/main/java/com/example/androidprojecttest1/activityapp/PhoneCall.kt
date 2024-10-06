package com.example.androidprojecttest1.activityapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.databinding.ActivityPhoneCallBinding

class PhoneCall : AppCompatActivity() {
    private var binding: ActivityPhoneCallBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneCallBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        sendButtonText()
        initButton()
    }

    private fun initButton() {
        binding?.run {
            callButton.setOnClickListener {
                val number = textInputEditText1.text?.toString()
                if (!number.isNullOrBlank()) {
                    dial(numberInput = number)
                }
            }
        }
    }

    private fun sendButtonText() {
        binding?.run {
            sendButton.setOnClickListener {
                val text = textInputEditText2.text?.toString()
                if (!text.isNullOrBlank()) {
                    sendText(text)
                }
            }
        }
    }

    private fun dial(numberInput: String) {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$numberInput"))
        startActivity(intent)
    }

    private fun sendText(text: String) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, text)
        startActivity(Intent.createChooser(intent, "send"))
    }
}
