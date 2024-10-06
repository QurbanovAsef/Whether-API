//package com.example.androidprojecttest1.lesson22
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.viewpager.widget.PagerAdapter
//import com.example.androidprojecttest1.databinding.LayoutPagerPageBinding
//
//class MyPagerAdapter(private val list: List<PagerModel>) : PagerAdapter() {
//
//    override fun instantiateItem(container: ViewGroup, position: Int): Any {
//        val inflater = LayoutInflater.from(container.context)
//        val binding = LayoutPagerPageBinding.inflate(inflater, container, false)
//        val item = list[position]
//        binding.tittle13.text = item.tittle
//        binding.tittle14.text = item.footer
//        binding.image13.setImageResource(item.icon)
//        return binding.root
//    }
//
//    override fun getCount(): Int {
//        return list.size
//    }
//
//    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
//
//    }
//
//    override fun isViewFromObject(view: View, `object`: Any): Boolean {
//        return true
//    }
//}