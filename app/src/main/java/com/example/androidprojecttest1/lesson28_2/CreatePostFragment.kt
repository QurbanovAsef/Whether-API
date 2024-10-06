package com.example.androidprojecttest1.lesson28_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.androidprojecttest1.databinding.FragmentCreatePostBinding

class CreatePostFragment : Fragment() {

private lateinit var binding: FragmentCreatePostBinding
private val viewModel by viewModels<CreatePostViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FragmentCreatePostBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.CreatePostButton.setOnClickListener {
            val tittle=binding.inputTitle.text.toString()
            val desc=binding.inputBody.text.toString()
            createPost(tittle,desc)
        }
    }
    private fun createPost(tittle:String,desc:String){
        viewModel.createPost(tittle,desc)
    }
}