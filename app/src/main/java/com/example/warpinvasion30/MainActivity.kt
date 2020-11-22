package com.example.warpinvasion30

import android.R.attr
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        menu_bottom.setItemSelected(R.id.profile, true)
        val fragmentFirst = ProfileFragment.newInstance()
        val manager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.linear_layout_container, fragmentFirst)
        transaction.commit()


        menu_bottom.setOnItemSelectedListener { id ->

            when (id) {
                R.id.profile -> {
                    val fragment = ProfileFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.linear_layout_container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                }

                R.id.challenges -> {
                    val fragment = WeeklyChallengesFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.linear_layout_container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                }

                R.id.collection -> {
                    val fragment = CollectionFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.linear_layout_container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                }

            }
        }

    }
}
