package com.example.androidprojecttest1.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidprojecttest1.R
import com.example.androidprojecttest1.databinding.ItemTextCardBinding

class TextListAdapter : RecyclerView.Adapter<ListViewHolder>() {

    private var list = mutableListOf<Note>()
    private lateinit var noteDao: NoteDao

    private val colors = listOf(
        R.color.note_color_1,
        R.color.note_color_2,
        R.color.note_color_3,
        R.color.note_color_4,
        R.color.note_color_5
    )

    fun addItems(item: List<Note>) {
        list.clear()
        list.addAll(item)
        notifyItemInserted(list.size - 1)
    }

    fun removeItem(position: Int) {
        if (position >= 0 && position < list.size) {
            val note = list[position]
            noteDao.deleteNote(note) // Bazadan da silirik
            list.removeAt(position)
            notifyItemRemoved(position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTextCardBinding.inflate(inflater, parent, false)
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(list[position], colors[position % colors.size])
        holder.itemView.setOnClickListener {
            removeItem(position)
        }
    }

    fun setNoteDao(dao: NoteDao) {
        noteDao = dao
    }
}
