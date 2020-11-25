package com.example.warpinvasion30

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.settingsButton
import kotlinx.android.synthetic.main.fragment_weekly_challenges.*


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

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        settingsButton.setOnClickListener {
            val intent = Intent (activity, SettingsActivity::class.java)
            startActivity(intent)
        }


        var j = 100
        val progressText = j.toString() + " %"
        progressBarText.text = progressText
        progressBar.progress = j


    }
}