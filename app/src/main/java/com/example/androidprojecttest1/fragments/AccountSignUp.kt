package com.example.androidprojecttest1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.androidprojecttest1.databinding.AccountSingUpBinding

class AccountSignUp : Fragment() {
    private var binding: AccountSingUpBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AccountSingUpBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val email = arguments?.getString("Email")
        val password = arguments?.getString("Password")

        binding?.apply {
            EmailSingIn.text = email
            testPassword.text = password

            backButton.setOnClickListener {
                parentFragmentManager.popBackStack()
                Toast.makeText(requireContext(), "Success", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
