//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Toast
//import androidx.fragment.app.Fragment
//import androidx.navigation.fragment.findNavController
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.androidprojecttest1.Lesson26HomeWork.Post
//import com.example.androidprojecttest1.Lesson26HomeWork.PostAdapter
//import com.example.androidprojecttest1.Lesson26HomeWork.PostService
//import com.example.androidprojecttest1.databinding.FragmentLesson26HomeWorkBinding
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//class Lesson26HomeWorkFragment : Fragment() {
//
//    private var binding: FragmentLesson26HomeWorkBinding? = null
//    private val postAdapter = PostAdapter()
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentLesson26HomeWorkBinding.inflate(inflater, container, false)
//        return binding?.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding?.recyclerView26?.layoutManager = LinearLayoutManager(context)
//        binding?.recyclerView26?.adapter = postAdapter
//        postAdapter.setOnItemClick { postId ->
//            val action = Lesson26FragmentDirections.actionToClickIdFragment(postId.toInt())
//            findNavController().navigate(action)
//        }
//        fetchPosts()
//    }
//
//    private fun fetchPosts() {
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://jsonplaceholder.typicode.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//        val service = retrofit.create(PostService::class.java)
//        service.getPosts().enqueue(object : Callback<List<Post>> {
//            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
//                if (response.isSuccessful) {
//                    val posts = response.body() ?: emptyList()
//                    postAdapter.addData(posts)
//                }
//            }
//
//            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
//                Toast.makeText(requireContext(), "Error: ${t.localizedMessage}", Toast.LENGTH_SHORT)
//                    .show()
//            }
//        })
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        binding = null
//    }
//}
