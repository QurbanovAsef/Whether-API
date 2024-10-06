package com.example.androidprojecttest1.lesson23

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidprojecttest1.databinding.FragmentEmailVerificationBinding

class EmailVerification : Fragment() {

    private var binding: FragmentEmailVerificationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEmailVerificationBinding.inflate(inflater, container, false)
        return binding?.root
    }

}
