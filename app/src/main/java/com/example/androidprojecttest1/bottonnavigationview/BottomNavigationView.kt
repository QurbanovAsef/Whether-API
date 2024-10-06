package com.example.androidprojecttest1.bottonnavigationview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidprojecttest1.R
import com.example.androidprojecttest1.databinding.ActivityBottomNavigationViewBinding
import com.example.androidprojecttest1.fragments.ExitFragment
import com.example.yourapp.fragments.HomeFragment
import com.example.yourapp.fragments.ProfileFragment
import com.example.yourapp.fragments.SettingsFragment

class BottomNavigationView : AppCompatActivity() {
    private var binding: ActivityBottomNavigationViewBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationViewBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbar)
        binding?.bottomMenu?.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> changeMyFragment(HomeFragment(), getString(R.string.Home))
                R.id.nav_profile -> changeMyFragment(ProfileFragment(), getString(R.string.profile))
                R.id.nav_settings -> changeMyFragment(
                    SettingsFragment(),
                    getString(R.string.settings)
                )

                R.id.nav_Exit -> changeMyFragment(ExitFragment(), getString(R.string.Exit))
                else -> HomeFragment()
            }
            true
        }
        changeMyFragment(HomeFragment(), getString(R.string.Home))
    }

    private fun changeMyFragment(fragment: Fragment, title: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.newMenuContainer, fragment)
            .commit()
        binding?.toolbar?.title = title
    }
}