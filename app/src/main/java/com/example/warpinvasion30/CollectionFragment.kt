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