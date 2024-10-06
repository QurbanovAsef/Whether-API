package com.example.androidprojecttest1.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.androidprojecttest1.databinding.FragmentSaveBinding

class SaveFragment : Fragment() {
    private var binding: FragmentSaveBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSaveBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.ButtonSave?.setOnClickListener {
            val title = binding?.textInputEditTextTitle?.text.toString()
            val text = binding?.textInputEditTextTitle1?.text.toString()

            binding?.textInputEditTextTitle?.text = null
            binding?.textInputEditTextTitle1?.text = null
            saveNote(title,text)
            parentFragmentManager.popBackStack()
            Toast.makeText(requireContext(), "Məlumat qeyd edildi", Toast.LENGTH_SHORT).show()
        }

    }
fun  saveNote (tittle:String,text:String){
    val noteDao=ClassDatabaseObject.getNoteDao()
    val note=Note(text=text, title = tittle)
    noteDao?.addNote(note)
}
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
