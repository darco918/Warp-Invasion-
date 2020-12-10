package com.example.warpinvasion30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_rewards2.*

private  lateinit var MyModelList: ArrayList<MyModel>
    private lateinit var myAdapter: CardAdapter


class RewardsActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rewards2)

        loadCards()

        viewPagerRewards.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
            }

        })
    }


    private fun loadCards(){
        MyModelList = ArrayList()

        MyModelList.add(MyModel("Weapons Skins", "Customize your guns", "Oct 5 2020", R.drawable.ic_sniper_rifle))
        MyModelList.add(MyModel("Player Skins", "Unlock new skins", "Sept 4 2020", R.drawable.ic_soldier))
        MyModelList.add(MyModel("Special Modes", "Play limited edition events", "Dec 25 2020", R.drawable.ic_christmas_mode))

        myAdapter = CardAdapter(this, MyModelList)
        viewPagerRewards.adapter = myAdapter

        viewPagerRewards.setPadding(100,0,100,0)



    }

}