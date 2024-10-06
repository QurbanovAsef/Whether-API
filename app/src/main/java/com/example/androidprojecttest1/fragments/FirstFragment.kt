package com.example.androidprojecttest1.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.example.androidprojecttest1.R
import com.example.androidprojecttest1.databinding.FirstFragments1Binding

class FirstFragment : Fragment() {
    private var binding: FirstFragments1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FirstFragments1Binding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListeners()

        binding?.textInputEditText1?.addTextChangedListener { text ->
            validateEmail(text.toString())
        }

        binding?.textInputEditText2?.addTextChangedListener { text ->
            validatePassword(text.toString())
        }

        binding?.textImputEditText3?.addTextChangedListener { text ->
            validateConfirmPassword(text.toString(), binding?.textInputEditText2?.text.toString())
        }
    }

    private fun setupClickListeners() {
        binding?.buttonText?.setOnClickListener {
            onNextClick()
        }

        binding?.imageButton1?.setOnClickListener {
            openUrl("https://www.google.com")
        }

        binding?.imageButton2?.setOnClickListener {
            openUrl("https://www.facebook.com")
        }

        binding?.imageButton3?.setOnClickListener {
            openUrl("https://www.apple.com")
        }
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        requireActivity().startActivity(intent)
        Toast.makeText(requireContext(), "Success", Toast.LENGTH_SHORT).show()
    }

    private fun onNextClick() {
        val email = binding?.textInputEditText1?.text.toString()
        val password = binding?.textInputEditText2?.text.toString()
        val confirmPassword = binding?.textImputEditText3?.text.toString()

        if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(requireContext(), "Please fill in the boxes", Toast.LENGTH_SHORT).show()
        } else if (!isValidEmail(email)) {
            binding?.id3?.error = "Invalid email format"
            binding?.textInputEditText1?.requestFocus() // Focus for the email input
        } else if (password.length < 8) {
            binding?.id31?.error = "Password must be at least 8 characters long"
            binding?.textInputEditText2?.requestFocus() // Focus for the password input
        } else if (!isValidPassword(password)) {
            binding?.id31?.error =
                "Password must contain at least one uppercase letter, one lowercase letter, and one digit"
            binding?.textInputEditText2?.requestFocus()
        } else if (password != confirmPassword) {
            binding?.id3?.error = null // Clear previous email error if any
            binding?.id32?.error = "Passwords do not match"
            binding?.textImputEditText3?.requestFocus() // Focus for the password confirmation input
        } else {
            binding?.id3?.error = null // Clear the email error
            binding?.id32?.error = null // Clear the password error

            // İstifadəçi məlumatlarını yaddaşda saxlayır
            val sharedPreferences =
                requireActivity().getSharedPreferences("UserData", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("Email", email)
            editor.putString("Password", password)
            editor.apply()

            val bundle = Bundle().apply {
                putString("Email", email)
                putString("Password", password)
                putString("ConfirmPassword", confirmPassword)
            }

            val accountSignUpFragment = AccountSignUp().apply {
                arguments = bundle
            }

            parentFragmentManager.beginTransaction()
                .replace(R.id.container, accountSignUpFragment)
                .addToBackStack(null)
                .commit()

            Toast.makeText(requireContext(), "You have successfully signed up!", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun validateEmail(email: String) {
        if (!isValidEmail(email)) {
            binding?.id3?.error = "Invalid email format"
            binding?.icCheckEmail?.visibility = View.GONE
        } else {
            binding?.id3?.error = null
            binding?.icCheckEmail?.visibility = View.VISIBLE
        }
    }

    private fun validatePassword(password: String) {
        if (password.length < 8 || !isValidPassword(password)) {
            binding?.id31?.error =
                "Password must contain at least one uppercase letter, one lowercase letter, and one digit"
            binding?.icCheckPassword?.visibility = View.GONE
        } else {
            binding?.id31?.error = null
            binding?.icCheckPassword?.visibility = View.VISIBLE
        }
    }

    private fun validateConfirmPassword(confirmPassword: String, password: String) {
        if (confirmPassword != password) {
            binding?.id32?.error = "Passwords do not match"
            binding?.icCheckConfirmPassword?.visibility = View.GONE
        } else {
            binding?.id32?.error = null
            binding?.icCheckConfirmPassword?.visibility = View.VISIBLE
        }
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isValidPassword(password: String): Boolean {
        val passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}"
        return password.matches(passwordPattern.toRegex())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
