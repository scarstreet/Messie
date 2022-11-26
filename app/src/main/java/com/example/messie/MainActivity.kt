package com.example.messie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import com.example.messie.databinding.ActivityMainBinding

// THIS IS AN ACTIVITY

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())
        binding.navBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(Home())
                R.id.goalList -> replaceFragment(GoalList())
                R.id.statistics -> replaceFragment(Home())
                R.id.settings -> replaceFragment(GoalList())
                else -> replaceFragment(Home())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}