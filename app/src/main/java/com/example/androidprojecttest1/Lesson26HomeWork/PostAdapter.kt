//package com.example.androidprojecttest1.Lesson26HomeWork
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.core.content.ContextCompat
//import androidx.recyclerview.widget.RecyclerView
//import com.example.androidprojecttest1.R
//import com.example.androidprojecttest1.databinding.ItemPostBinding
//
//class PostAdapter(private val onItemClicked: (Post) -> Unit) :
//    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
//
//    private val dataList = mutableListOf<Post>()
//
//    // Rəngləri təyin edirik
//    private val colors = listOf(
//        R.color.color1, // Birinci rəng
//        R.color.color2, // İkinci rəng
//        R.color.color3, // Üçüncü rəng
//        R.color.color4, // Dördüncü rəng
//        R.color.color5  // Beşinci rəng
//    )
//
//    fun addData(newList: List<Post>) {
//        dataList.clear()
//        dataList.addAll(newList)
//        notifyDataSetChanged()
//    }
//
//    class PostViewHolder(
//        private val binding: ItemPostBinding,
//        private val onItemClicked: (Post) -> Unit
//    ) : RecyclerView.ViewHolder(binding.root) {
//
//        fun bind(post: Post, color: Int) {
//            binding.title26.text = post.title
//            binding.body26.text = post.body
//
//            // Rəng təyini
//            val context = binding.root.context
//            (binding.root as androidx.cardview.widget.CardView).setCardBackgroundColor(
//                ContextCompat.getColor(context, color)
//            )
//
//            // Click hadisəsi
//            binding.root.setOnClickListener {
//                onItemClicked(post)
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val binding = ItemPostBinding.inflate(inflater, parent, false)
//        return PostViewHolder(binding, onItemClicked)
//    }
//
//    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
//        val color = colors[position % colors.size]
//        holder.bind(dataList[position], color)
//    }
//
//    override fun getItemCount(): Int {
//        return dataList.size
//    }
//}
