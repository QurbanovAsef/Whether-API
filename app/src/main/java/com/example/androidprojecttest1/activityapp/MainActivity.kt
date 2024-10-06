package com.example.androidprojecttest1.activityapp

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttest1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        initViews()
        setupGoogle()
        setupFacebook()
        setupApple()
        setupAlreadyAccount()
    }

    private fun initViews() {
        binding?.buttonText?.setOnClickListener {
            onNextClick()
        }

        // Add TextWatchers to clear error messages
        binding?.textImputEditText1?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding?.id3?.error = null // Clear email error
            }

            override fun afterTextChanged(s: Editable?) {}
        })
        binding?.textImputEditText2?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding?.id31?.error = null // Clear password error
            }

            override fun afterTextChanged(s: Editable?) {}
        })
        binding?.textImputEditText3?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding?.id32?.error = null // Clear confirm password error
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun onNextClick() {
        val email = binding?.textImputEditText1?.text.toString()
        val password = binding?.textImputEditText2?.text.toString()
        val confirmPassword = binding?.textImputEditText3?.text.toString()
        if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Please fill in the boxes", Toast.LENGTH_SHORT).show()
        } else if (!isValidEmail(email)) {
            binding?.id3?.error = "Invalid email format"
            binding?.textImputEditText1?.requestFocus() // Focus for the email input
        } else if (password.length < Constants.PASSWORD_LENGTH) {
            binding?.id31?.error = "Password must be at least 8 characters long"
            binding?.textImputEditText2?.requestFocus() // Focus for the password input
        } else if (!isValidPassword(password)) {
            binding?.id31?.error =
                "Password must contain at least one uppercase letter, one lowercase letter, and one digit"
            binding?.textImputEditText2?.requestFocus()
        } else if (password != confirmPassword) {
            binding?.id3?.error = null // Clear previous email error if any
            binding?.id32?.error = "Passwords do not match"
            binding?.textImputEditText3?.requestFocus() // Focus for the password confirmation input
        } else {
            binding?.id3?.error = null // Clear the email error
            binding?.id32?.error = null // Clear the password error
            val intent = Intent(this, AccountCreated::class.java)
            intent.putExtra("Email", email)
            intent.putExtra("Password", password)
            intent.putExtra("ConfirmPassword", confirmPassword)
            startActivity(intent)
        }
    }

    private fun isValidPassword(password: String): Boolean {
        val regex = Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{${Constants.PASSWORD_LENGTH},}$")
        return regex.matches(password)
    }

    private fun isValidEmail(email: String) = Patterns.EMAIL_ADDRESS.matcher(email).matches()

    private fun setupAlreadyAccount() {
        binding?.idText1?.setOnClickListener {
            onNextClickAlreadyAccount()
        }
    }

    private fun onNextClickAlreadyAccount() {
        val intent = Intent(this, PhoneCall::class.java)
        startActivity(intent)
    }

    private fun setupGoogle() {
        binding?.imageButton1?.setOnClickListener {
            onNextClickGoogle()
        }
    }

    private fun onNextClickGoogle() {
        val intent = Intent(this, GoogleActivity::class.java)
        startActivity(intent)
    }

    private fun setupFacebook() {
        binding?.imageButton2?.setOnClickListener {
            onNextClickFacebook()
        }
    }

    private fun onNextClickFacebook() {
        val intent = Intent(this, FacebookActivity::class.java)
        startActivity(intent)
    }

    private fun setupApple() {
        binding?.imageButton3?.setOnClickListener {
            onNextClickApple()
        }
    }

    private fun onNextClickApple() {
        val intent = Intent(this, AppleActivity::class.java)
        startActivity(intent)
    }







    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
