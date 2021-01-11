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

    val  values = arrayOf("Defeat mummies", "Get a double kill" , "Shoot enemies from above", "Survive a one minute without shooting", "Reach wave no. 10" )
    val numbers = arrayOf(30,1,10,1,1)
    val completed = arrayOf(21,1,5,0,1)
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

        //checking how many challenges are complete and then updating the progressbar
        var contor =0
        for (i in numbers.indices){
            if(numbers[i] == completed[i])
                contor++
        }
        progressBar.progress = (contor / numbers.size.toDouble() * 100).toInt()
        progressBarText.text = (contor / numbers.size.toDouble() * 100).toInt() . toString() + "%"


        settingsButton.setOnClickListener {
            val intent = Intent (activity, SettingsActivity::class.java)
            startActivity(intent)
        }

        manager = LinearLayoutManager(activity)
        myAdapter = MyAdapter(values, numbers, completed)
        recyclerView =view.findViewById<RecyclerView>(R.id.recycler_view).apply {
            layoutManager = manager
            adapter =  myAdapter
        }

    }
}


class MyAdapter(private val myDataSet : Array<String>, private  val numbersToComplete: Array<Int>,  private  val completed: Array<Int>):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(val view: View): RecyclerView.ViewHolder(view){
        fun bind(text: String, number:Int, completed:Int){
            val tv = view.findViewById<TextView>(R.id.textView)
            tv.text = text
            val numberOfCompletedChallenges = view.findViewById<TextView>(R.id.numberOfCompletedChallenges)
            val aux = completed.toString()  +" /"+number.toString()
            numberOfCompletedChallenges.text = aux

            val j= (completed/number.toDouble() *100).toInt()
            val progressBarChallenge = view.findViewById<ProgressBar>(R.id.progressBarChallenge)
            progressBarChallenge.progress = j
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vh = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false)
        return ViewHolder(vh)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(myDataSet[position], numbersToComplete[position],completed[position] )
    }

    override fun getItemCount(): Int {
        return myDataSet.size
    }

}