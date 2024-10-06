package com.example.androidprojecttest1.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.androidprojecttest1.databinding.ItemTextCardBinding

class ListViewHolder(private val binding: ItemTextCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(note: Note, color: Int) {
        binding.itemTextView.text = note.title
        binding.itemTextView1.text = note.text
        binding.itemTextView.setBackgroundResource(color)
    }
}
