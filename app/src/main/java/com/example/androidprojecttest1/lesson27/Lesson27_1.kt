

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidprojecttest1.databinding.FragmentLesson271Binding
import com.example.androidprojecttest1.lesson27.ApiService
import com.example.androidprojecttest1.lesson27.FactsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Lesson27_1 : Fragment() {
    private lateinit var binding: FragmentLesson271Binding
    private val adapter = Lesson27Adapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLesson271Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lesson271Recycler.adapter = adapter

//        adapter.setOnItemClick {
//            findNavController().navigate(
//                Lesson27_1Directions.actionLesson271ToLesson272Fragment()
//            )
//        }

        val client = Retrofit.Builder()
            .baseUrl("https://cat-fact.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val apiCall = client.create(ApiService::class.java)


        apiCall.getFacts().enqueue(object : Callback<List<FactsResponse>> {

            override fun onResponse(
                call: Call<List<FactsResponse>>,
                response: Response<List<FactsResponse>>
            ) {
                adapter.addData(response.body().orEmpty())

            }

            override fun onFailure(p0: Call<List<FactsResponse>>, throwable: Throwable) {
                Log.d("defefe", "onResponse:${throwable.localizedMessage}")
            }

        })
    }
}
