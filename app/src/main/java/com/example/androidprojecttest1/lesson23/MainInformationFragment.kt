package com.example.androidprojecttest1.lesson23

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidprojecttest1.databinding.FragmentMainInformationBinding

class MainInformationFragment : Fragment() {

        private var binding: FragmentMainInformationBinding? = null

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentMainInformationBinding.inflate(inflater, container, false)
            return binding?.root
        }

    }

