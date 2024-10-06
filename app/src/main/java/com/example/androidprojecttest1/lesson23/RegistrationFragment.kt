package com.example.androidprojecttest1.lesson23

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidprojecttest1.R
import com.example.androidprojecttest1.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {

    private var binding: FragmentRegistrationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Binding vasitəsilə düyməyə giriş əldə edin
        binding?.btnSendCode?.setOnClickListener {
            findNavController().navigate(R.id.emailVerification)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Binding obyektini təmizləyin ki, xatirə sızması baş verməsin
        binding = null
    }
}
