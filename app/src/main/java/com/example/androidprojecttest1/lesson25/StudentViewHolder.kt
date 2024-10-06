import androidx.recyclerview.widget.RecyclerView
import com.example.androidprojecttest1.databinding.ItemLesson25Binding
import com.example.androidprojecttest1.lesson25.ClassEntity

class StudentViewHolder(private val binding: ItemLesson25Binding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(student: ClassEntity, onDeleteClick: (ClassEntity) -> Unit) {
        binding.title.text = "${student.name} ${student.surname}"
        binding.delete.setOnClickListener {
            onDeleteClick(student)
        }
    }
}
