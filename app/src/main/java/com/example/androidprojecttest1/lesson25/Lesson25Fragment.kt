package com.example.androidprojecttest1.lesson25

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidprojecttest1.databinding.FragmentLesson25Binding
import com.example.androidprojecttest1.myViewModel.MyFirstViewModel

class Lesson25Fragment : Fragment() {

    private var binding: FragmentLesson25Binding? = null
    private lateinit var adapter: StudentAdapter
    private val viewModel by viewModels<MyFirstViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.initDatabase(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLesson25Binding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // RecyclerView setup
        binding?.recyclerView?.layoutManager = LinearLayoutManager(requireContext())
        adapter = StudentAdapter(mutableListOf()) { student ->
            deleteStudent(student)
        }
        binding?.recyclerView?.adapter = adapter
        binding?.saveButton?.setOnClickListener {
            save()
        }
        viewModel.getAllStudents()?.observe(viewLifecycleOwner){students->
            adapter.setData(students)
        }
    }
    private fun save() {
        val name = binding?.inputName?.text.toString()
        val surname = binding?.inputSurname?.text.toString()
        binding?.inputName?.text = null
        binding?.inputSurname?.text = null
        viewModel.saveStudent(name, surname)
    }
    private fun deleteStudent(student: ClassEntity) {
        viewModel.deleteStudent(student)
    }
    override fun onDestroyView() {
        viewModel.destroyDatabase()
        super.onDestroyView()
        binding = null
    }
}