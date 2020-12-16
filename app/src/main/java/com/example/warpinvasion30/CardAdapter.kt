package com.example.warpinvasion30

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.card_item.view.*

class CardAdapter(private  val context:Context, private val myModelArrayList: ArrayList<MyModel>): PagerAdapter() {

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

        var listview = view.findViewById<ListView>(R.id.weaponsListView2)

        var list = mutableListOf<WeaponModel>()

        list.add(WeaponModel(
            "Rainbow Rifle", R.drawable.ic_sniper_rifle))
        list.add(WeaponModel(
            "Lavacake AR", R.drawable.ic_sniper_rifle))
        list.add(WeaponModel(
            "Butterfly Carbine", R.drawable.ic_sniper_rifle))
        list.add(WeaponModel(
            "Jack Daniel's Barrel Shotgun", R.drawable.ic_sniper_rifle))
        list.add(WeaponModel(
            "FP6 Classic", R.drawable.ic_sniper_rifle))
        list.add(WeaponModel(
            "Corona Destroyer", R.drawable.ic_sniper_rifle))
        list.add(WeaponModel(
            "Camper's Snipez", R.drawable.ic_sniper_rifle))
        list.add(WeaponModel(
            "Gold Sniper", R.drawable.ic_sniper_rifle))
        list.add(WeaponModel(
            "Nuketown 2020", R.drawable.ic_sniper_rifle))

        listview.adapter = WeaponsListviewAdapter(view.context,R.layout.weapons_list_item,  list)
       // Utility.setListViewHeightBasedOnChildren(listview)





        container.addView(view, position)


        return view
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}