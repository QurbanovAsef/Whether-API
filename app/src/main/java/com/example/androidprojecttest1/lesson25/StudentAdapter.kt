package com.example.androidprojecttest1.lesson25

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidprojecttest1.databinding.ItemLesson25Binding

class StudentAdapter(private val students: MutableList<ClassEntity>, private val onDeleteClick: (ClassEntity) -> Unit) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    fun setData(newItems: List<ClassEntity>) {
        students.clear()
        students.addAll(newItems)
        notifyDataSetChanged()
    }

    inner class StudentViewHolder(private val binding: ItemLesson25Binding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(student: ClassEntity) {
            binding.title.text = " ${student.name} ${student.surname}"
            binding.delete.setOnClickListener {
                onDeleteClick(student)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemLesson25Binding.inflate(inflater, parent, false)
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = students[position]
        holder.bind(student)
    }

    override fun getItemCount(): Int = students.size
}
