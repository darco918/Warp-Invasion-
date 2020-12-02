package com.example.warpinvasion30

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_collection.*
import kotlinx.android.synthetic.main.fragment_profile.settingsButton

class CollectionFragment : Fragment() {
    private lateinit var viewOfLayout: View

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
            startActivity(intent)
        }

        characterSkinsLayout.setOnClickListener {
            val intent = Intent (activity, RewardsActivity::class.java)
            startActivity(intent)
        }

        specialModesLayout.setOnClickListener {
            val intent = Intent (activity, RewardsActivity::class.java)
            startActivity(intent)
        }

        weaponsSkinsCardView.setOnTouchListener(object : OnSwipeTouchListener(activity) {
            override fun onSwipeLeft() {
                super.onSwipeLeft()
                Toast.makeText(activity, "Swipe Left gesture detected",
                    Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onSwipeRight() {
                super.onSwipeRight()
                Toast.makeText(
                    activity,
                    "Swipe Right gesture detected",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onSwipeUp() {
                super.onSwipeUp()
                Toast.makeText(activity, "Swipe up gesture detected", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onSwipeDown() {
                super.onSwipeDown()
                Toast.makeText(activity, "Swipe down gesture detected", Toast.LENGTH_SHORT)
                    .show()
            }
        })


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
}