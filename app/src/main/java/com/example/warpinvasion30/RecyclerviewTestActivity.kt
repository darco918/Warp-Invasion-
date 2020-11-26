package com.example.warpinvasion30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewTestActivity : AppCompatActivity() {

    val  values = arrayOf("one", "two" , "three", "four", "five" , "six", "seven", "eight", "nine", "ten")

    private lateinit var recyclerView: RecyclerView
    private lateinit var manager: RecyclerView.LayoutManager
    private lateinit var myAdapter: RecyclerView.Adapter<*>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview_test)

//        manager = LinearLayoutManager(this)
//        myAdapter = MyAdapter(values)
//
//        recyclerView = findViewById<RecyclerView>(R.id.recycler_view).apply {
//            layoutManager = manager
//            adapter =  myAdapter
    //    }
    }
}
//
// class MyAdapter(private val myDataSet : Array<String>):
//    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
//
//    class ViewHolder(val view: View): RecyclerView.ViewHolder(view){
//        fun bind(text: String){
//            val tv = view.findViewById<TextView>(R.id.textView)
//            tv.text = text
//
//            val j= 66
//            val progressBarChallenge = view.findViewById<ProgressBar>(R.id.progressBarChallenge)
//            progressBarChallenge.progress = j
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val vh = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false)
//        return ViewHolder(vh)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.bind(myDataSet[position])
//    }
//
//    override fun getItemCount(): Int {
//        return myDataSet.size
//    }
//
//}