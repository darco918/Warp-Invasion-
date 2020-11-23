package com.example.warpinvasion30

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.*


class WeeklyChallengesFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_weekly_challenges, container, false)
    }

    companion object {
        fun newInstance(): WeeklyChallengesFragment {

            return WeeklyChallengesFragment()
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        settingsButton.setOnClickListener {
            val intent = Intent (activity, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}