package com.example.warpinvasion30

import android.R
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {

    private lateinit var viewOfLayout: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        viewOfLayout = inflater.inflate(com.example.warpinvasion30.R.layout.fragment_profile, container, false)

        return viewOfLayout

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        settingsButton.setOnClickListener {
            //FirebaseAuth.getInstance().signOut()
            val intent = Intent (activity, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
    companion object {
        fun newInstance(): ProfileFragment {
          val fragment = ProfileFragment()
            return fragment
        }
    }


}