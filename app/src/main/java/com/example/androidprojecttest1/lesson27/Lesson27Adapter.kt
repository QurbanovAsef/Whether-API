// Düzəliş edilmiş Lesson27Adapter kodu
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.androidprojecttest1.databinding.ItemLesson27Binding
import com.example.androidprojecttest1.lesson27.FactsResponse

class Lesson27Adapter : Adapter<Lesson27Adapter.Lesson27ViewHolder>() {
    private val dataList = mutableListOf<FactsResponse>()
    private var onItemClick: ((id: String?) -> Unit)? = null
    fun setOnItemClick(listener: (id: String?) -> Unit) {
        this.onItemClick = listener
    }

    fun addData(newList: List<FactsResponse>) {
        dataList.clear()
        dataList.addAll(newList)
        notifyDataSetChanged()
    }

    inner class Lesson27ViewHolder(private val binding: ItemLesson27Binding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: FactsResponse) {
            binding.firstText.text = data.user
            binding.secondText.text = data.text
            binding.thirdText.text = data.used.toString()
            binding.fourthText.text = data.id

            binding.root.setOnClickListener {
                onItemClick?.invoke(data.id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Lesson27ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemLesson27Binding.inflate(inflater, parent, false)
        return Lesson27ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: Lesson27ViewHolder, position: Int) {
        holder.onBind(dataList[position])
    }
}
