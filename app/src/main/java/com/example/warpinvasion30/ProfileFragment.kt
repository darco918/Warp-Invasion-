package com.example.warpinvasion30

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_profile, container, false)
    }


    companion object {
        fun newInstance(): ProfileFragment {

//            val args = Bundle()
//            args.putString("numeVoluntar", numeVoluntar)
//            args.putInt("pozitie", pozitie)
          val fragment = ProfileFragment()
//            fragment.arguments = args
            return fragment
        }

    }
}