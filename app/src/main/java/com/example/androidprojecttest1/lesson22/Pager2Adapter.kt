//package com.example.androidprojecttest1.lesson22
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.androidprojecttest1.databinding.LayoutPagerPageBinding
//
//class Pager2Adapter(private val items: List<PagerModel>) :
//    RecyclerView.Adapter<Pager2Adapter.PagerViewHolder>() {
//
//    class PagerViewHolder(private val binding: LayoutPagerPageBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        fun onBind(data: PagerModel) {
//            binding.tittle13.text = data.tittle
//            binding.tittle14.text = data.footer
//            binding.image13.setImageResource(data.icon)
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val binding = LayoutPagerPageBinding.inflate(inflater, parent, false)
//        return PagerViewHolder(binding)
//    }
//
//    override fun getItemCount(): Int {
//        return items.size
//    }
//
//    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
//        holder.onBind(items[position])
//    }
//}
