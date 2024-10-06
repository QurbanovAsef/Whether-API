//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.androidprojecttest1.Lesson26HomeWork.Post
//import com.example.androidprojecttest1.databinding.ItemPostBinding
//
//class ClickAdapter : RecyclerView.Adapter<ClickAdapter.ClickViewHolder>() {
//
//    private val detailList = mutableListOf<Post>()
//    private var onItemClick: ((id: Int) -> Unit)? = null
//
//    fun setOnItemClick(listener: (id: Int) -> Unit) {
//        this.onItemClick = listener
//    }
//
//    fun setDetails(newList: List<Post>) {
//        detailList.clear()
//        detailList.addAll(newList)
//        notifyDataSetChanged()
//    }
//
//    inner class ClickViewHolder(private val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(post: Post) {
//            binding.title26.text = post.title
//            binding.body26.text = post.body
//
//            binding.root.setOnClickListener {
//                if(post.id!=null){
//                    onItemClick?.invoke(post.id!!)
//                }
//
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClickViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val binding = ItemPostBinding.inflate(inflater, parent, false)
//        return ClickViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: ClickViewHolder, position: Int) {
//        holder.bind(detailList[position])
//    }
//
//    override fun getItemCount(): Int {
//        return detailList.size
//    }
//}
