package com.example.warpinvasion30

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WeeklyChallengesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WeeklyChallengesFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_weekly_challenges, container, false)
    }

    companion object {
        fun newInstance(): WeeklyChallengesFragment {

//            val args = Bundle()
//            args.putString("numeVoluntar", numeVoluntar)
//            args.putInt("pozitie", pozitie)
            val fragment = WeeklyChallengesFragment()
//            fragment.arguments = args
            return fragment
        }

    }
}