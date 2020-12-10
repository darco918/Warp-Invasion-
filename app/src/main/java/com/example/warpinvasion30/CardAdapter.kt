package com.example.warpinvasion30

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.card_item.view.*

class CardAdapter(private  val context:Context, private val myModelArrayList: ArrayList<MyModel>):PagerAdapter() {

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
return myModelArrayList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

       val view = LayoutInflater.from(context).inflate(R.layout.card_item,container, false)

        val model = myModelArrayList[position]
        val title = model.title
        val description = model.description
        val image = model.image
        val date = model.date


        view.bannerIv.setImageResource(image)
        view.titleTv.text= title
        view.description.text= description
        view.dateTv.text = date


        view.setOnClickListener{
            Toast.makeText(context, "$title \n $description \n $date ", Toast.LENGTH_SHORT).show()
        }

        container.addView(view, position)


        return view
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}