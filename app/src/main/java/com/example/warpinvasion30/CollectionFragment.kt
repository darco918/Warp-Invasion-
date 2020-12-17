package com.example.warpinvasion30

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_rewards2.*
import kotlinx.android.synthetic.main.fragment_collection.*
import kotlinx.android.synthetic.main.fragment_profile.settingsButton

class CollectionFragment : Fragment() {
    private lateinit var viewOfLayout: View
    private  lateinit var MyModelList: ArrayList<MyModel>
    private lateinit var myAdapter: CardAdapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewOfLayout = inflater.inflate(R.layout.fragment_collection, container, false)

        return viewOfLayout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        settingsButton.setOnClickListener {
            val intent = Intent (activity, SettingsActivity::class.java)
            startActivity(intent)
        }

        weaponsLayout.setOnClickListener {
            val intent = Intent (activity, RewardsActivity::class.java)
            intent.putExtra("pageNumber", 1)
            startActivity(intent)
        }

        specialModesLayout.setOnClickListener {
            val intent = Intent (activity, RewardsActivity::class.java)
            intent.putExtra("pageNumber", 2)
            startActivity(intent)
        }

        characterSkinsLayout.setOnClickListener {
            val intent = Intent (activity, RewardsActivity::class.java)
            intent.putExtra("pageNumber", 3)
            startActivity(intent)
        }


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

        MyModelList = ArrayList()
        MyModelList.add(MyModel("Weapons Skins", "Customize your guns", "Oct 5 2020", R.drawable.ic_sniper_rifle))
        MyModelList.add(MyModel("Player Skins", "Unlock new skins", "Sept 4 2020", R.drawable.ic_soldier))
        MyModelList.add(MyModel("Special Modes", "Play limited edition events", "Dec 25 2020", R.drawable.ic_christmas_mode))

    }

    companion object {
        fun newInstance(): CollectionFragment {

//            val args = Bundle()
//            args.putString("numeVoluntar", numeVoluntar)
//            args.putInt("pozitie", pozitie)
            //            fragment.arguments = args
            return CollectionFragment()
        }

    }

    private fun loadCards(){

    }
}