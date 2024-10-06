//package com.example.androidprojecttest1.lesson27
//import Lesson27_1Args.Lesson27_1Args
//import android.os.Bundle
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.core.os.bundleOf
//import androidx.fragment.app.Fragment
//import com.example.androidprojecttest1.databinding.FragmentLesson272Binding
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//class Lesson27_2Fragment : Fragment() {
//    private lateinit var binding: FragmentLesson272Binding
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentLesson272Binding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
////        val args = Lesson27_1Args.fromBundle(arguments ?: bundleOf())
////        val id = args.id
//
//        val client = Retrofit.Builder()
//            .baseUrl("https://cat-fact.herokuapp.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//        val apiCall = client.create(ApiService::class.java)
//        apiCall.getFactById(id).enqueue(object : Callback<FactResponse> {
//
//            override fun onResponse(call: Call<FactResponse>, response: Response<FactResponse>) {
//                Log.d("djdjdjdjddjj", "onResponse:$response")
//                val data = response.body()
//                if (data != null) {
//                    onSuccess(data)
//                }
//            }
//
//            override fun onFailure(call: Call<FactResponse>, throwable: Throwable) {
//
//            }
//
//        })
//    }
//
//    private fun onSuccess(data: FactResponse) {
//
//        binding.firstText.text = data.text
//        binding.secondText.text = data.used.toString()
//        binding.thirdText.text = data.id
//
//    }
//}
