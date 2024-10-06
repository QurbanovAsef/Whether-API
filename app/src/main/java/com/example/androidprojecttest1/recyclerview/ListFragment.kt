package com.example.androidprojecttest1.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidprojecttest1.R
import com.example.androidprojecttest1.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private var binding: FragmentListBinding? = null
    private val textAdapter = TextListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getAllNotes()

        binding?.recyclerview?.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.VERTICAL, false
        )
        val decor = SpaceItemDecoration(20)
        binding?.recyclerview?.addItemDecoration(decor)
        binding?.recyclerview?.adapter = textAdapter

        binding?.addButton?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.listContainer, SaveFragment())
                .addToBackStack(null)
                .commit()
        }

    }

    fun getAllNotes() {
        val noteDao = ClassDatabaseObject.getNoteDao()
        val list = noteDao?.getAllNotes().orEmpty()
        textAdapter.addItems(list)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
