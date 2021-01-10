package com.example.warpinvasion30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.viewpager.widget.ViewPager
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_rewards.*
import kotlinx.android.synthetic.main.activity_rewards2.*
import kotlinx.android.synthetic.main.fragment_characters_page.*
import kotlinx.android.synthetic.main.fragment_characters_page.view.*
import kotlinx.android.synthetic.main.fragment_collection.view.*
import me.relex.circleindicator.CircleIndicator

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


        //charactersListView.setOnItemClickListener(CharactersListviewAdapter,)




        //bottom navigation bar click listeners
        menu_bottom2.setItemSelected(R.id.collection, true)
        val indicator  = findViewById<CircleIndicator>(R.id.indicator)
        indicator.setViewPager(viewPagerRewards)
        menu_bottom2.setOnItemSelectedListener { id ->
            when (id) {
                R.id.profile -> {
                    val intent = Intent(this, MainActivity::class.java )
                    intent.putExtra("id",1)
                    startActivity(intent)
                }
                R.id.challenges -> {
                    val intent = Intent(this, MainActivity::class.java )
                    intent.putExtra("id",2)
                    startActivity(intent)
                }

            }
        }
    }


    private fun loadCards(){
        MyModelList = ArrayList()

        MyModelList.add(MyModel("Weapons Skins", "Customize your guns", "Oct 5 2020", R.drawable.ic_sniper_rifle))
        MyModelList.add(MyModel("Player Skins", "Unlock new skins", "Sept 4 2020", R.drawable.ic_soldier))
        MyModelList.add(MyModel("Special Modes", "Play limited edition events", "Dec 25 2020", R.drawable.ic_christmas_mode))

        myAdapter = CardAdapter(this, MyModelList)
        viewPagerRewards.adapter = myAdapter
        viewPagerRewards.setPadding(50,0,50,0)



    }



}