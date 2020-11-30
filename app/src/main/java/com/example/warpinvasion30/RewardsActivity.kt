package com.example.warpinvasion30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_rewards.*
import me.relex.circleindicator.CircleIndicator

class RewardsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rewards)

        val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(WeaponsPageFragment(), "One")
        adapter.addFragment(SpecialModesPageFragment(), "Two")
        adapter.addFragment(CharactersPageFragment(), "One")

        viewPager.adapter = adapter
        val indicator  = findViewById<CircleIndicator>(R.id.indicator)
        indicator.setViewPager(viewPager)

    }

    class MyViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

        private val fragmentList: MutableList<Fragment> = ArrayList()
        private val titleList: MutableList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }

        override fun getCount(): Int {
            return fragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            fragmentList.add(fragment)
            titleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }
    }
}