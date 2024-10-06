package com.example.androidprojecttest1.PDF

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.androidprojecttest1.R
import com.example.androidprojecttest1.databinding.ActivityNavigationMenuFileBinding
import com.example.yourapp.fragments.HomeFragment

class NavigationMenuFile : AppCompatActivity() {
    private var binding: ActivityNavigationMenuFileBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationMenuFileBinding.inflate(layoutInflater)
       setContentView(binding?.root)


        val toggle = ActionBarDrawerToggle(
            this,
            binding?.mainDrawer,
            binding?.toolbar,
            R.string.drawerOpen,
            R.string.drawerClose
        )
        binding?.mainDrawer?.addDrawerListener(toggle)
        toggle.syncState()

        binding?.navigationView?.setNavigationItemSelectedListener { selectedMenuItem ->
            changeFragmentOnMenuSelect(selectedMenuItem)
            true
        }

        // Set default fragment
        changeFragment(HomeFragment(), getString(R.string.Home))
        binding?.navigationView?.setCheckedItem(R.id.nav_home)
    }

    private fun changeFragmentOnMenuSelect(item: MenuItem) {
        when (item.itemId) {
            R.id.nav_home -> changeFragment(HomeFragment(), getString(R.string.Home))
            // Add other cases if needed
            else -> {
                // Handle other menu items if necessary
            }
        }
    }

    private fun changeFragment(fragment: Fragment, title: String) {
        supportFragmentManager.beginTransaction().replace(R.id.navigationContainer, fragment)
            .commit()
        binding?.toolbar?.title = title
        binding?.mainDrawer?.closeDrawer(GravityCompat.START)
    }

    override fun onBackPressed() {
        if (binding?.mainDrawer?.isDrawerOpen(GravityCompat.START) == true) {
            binding?.mainDrawer?.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}