package com.example.warpinvasion30

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CollectionFragment : Fragment() {
    private lateinit var viewOfLayout: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewOfLayout = inflater.inflate(R.layout.fragment_collection, container, false)

        return viewOfLayout
    }


    companion object {
        fun newInstance(): CollectionFragment {

//            val args = Bundle()
//            args.putString("numeVoluntar", numeVoluntar)
//            args.putInt("pozitie", pozitie)
            val fragment = CollectionFragment()
//            fragment.arguments = args
            return fragment
        }

    }
}