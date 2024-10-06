//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import com.example.androidprojecttest1.R
//import com.example.androidprojecttest1.databinding.FragmentPagerBinding
//import com.example.androidprojecttest1.lesson22.Pager2Adapter
//import com.example.androidprojecttest1.lesson22.PagerModel
//
//class PagerFragment : Fragment() {
//    private var binding: FragmentPagerBinding? = null
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentPagerBinding.inflate(inflater, container, false)
//        return binding?.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val items = listOf(
//            PagerModel("home", R.drawable.ic_home, "First"),
//            PagerModel("exit", R.drawable.ic_exit, "Second"),
//            PagerModel("add", R.drawable.ic_add, "Third"),
//            PagerModel("delete", R.drawable.ic_delete, "fourth")
//        )
//
//        val pager2Adapter = Pager2Adapter(items)
//        binding?.viewPager2?.adapter = pager2Adapter
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        binding = null
//    }
//}
