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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_profile.settingsButton
import kotlinx.android.synthetic.main.fragment_weekly_challenges.*


class WeeklyChallengesFragment : Fragment(){

    val  values = arrayOf("one", "two" , "three", "four", "five" , "six", "seven", "eight", "nine", "ten")

    private lateinit var recyclerView: RecyclerView
    private lateinit var manager: RecyclerView.LayoutManager
    private lateinit var myAdapter: RecyclerView.Adapter<*>

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

        manager = LinearLayoutManager(activity)
        myAdapter = MyAdapter(values)
        recyclerView =view.findViewById<RecyclerView>(R.id.recycler_view).apply {
            layoutManager = manager
            adapter =  myAdapter
        }

    }
}


class MyAdapter(private val myDataSet : Array<String>):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(val view: View): RecyclerView.ViewHolder(view){
        fun bind(text: String){
            val tv = view.findViewById<TextView>(R.id.textView)
            tv.text = text

            val j= 66
            val progressBarChallenge = view.findViewById<ProgressBar>(R.id.progressBarChallenge)
            progressBarChallenge.progress = j
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vh = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false)
        return ViewHolder(vh)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(myDataSet[position])
    }

    override fun getItemCount(): Int {
        return myDataSet.size
    }

}