//package com.example.androidprojecttest1.Lesson26HomeWork
//
//import ClickAdapter
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Toast
//import androidx.fragment.app.Fragment
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.androidprojecttest1.databinding.FragmentClickIdBinding
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//class ClickIdFragment : Fragment() {
//
//    private var binding: FragmentClickIdBinding? = null
//    private val clickAdapter = ClickAdapter()
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentClickIdBinding.inflate(inflater, container, false)
//        return binding?.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding?.recyclerViewClick?.layoutManager = LinearLayoutManager(requireContext())
//        binding?.recyclerViewClick?.adapter = clickAdapter
//        fetchPosts()
//    }
//
//    private fun fetchPosts() {
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://jsonplaceholder.typicode.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//        val service = retrofit.create(PostService::class.java)
//        // Burada URL-də ID parametri ilə postu fetch edirik
//        val postId = arguments?.getInt("postId") ?: return
//        service.getPostById(postId).enqueue(object : Callback<Post> {
//            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                if (response.isSuccessful) {
//                    val post = response.body()
//                    if (post != null) {
//                        clickAdapter.setDetails(listOf(post))
//                    }
//                }
//            }
//
//            override fun onFailure(call: Call<Post>, t: Throwable) {
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
