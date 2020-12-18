package com.example.warpinvasion30

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.PagerAdapter
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import kotlinx.android.synthetic.main.card_item.view.*

class CardAdapter(private  val context:Context, private val myModelArrayList: ArrayList<MyModel>): PagerAdapter() {

    var listWeapon = mutableListOf<WeaponModel>()
    var listCharacter = mutableListOf<CharacterSkinModel>()
    var listModes = mutableListOf<CharacterSkinModel>()


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

        val listview = view.findViewById<ListView>(R.id.weaponsListView2)
        addCharacters()

        if(position == 0){
            addWeapons()
            listview.adapter = WeaponsListviewAdapter(view.context,R.layout.weapons_list_item,  listWeapon)
        }

        else{
            if (position == 1){
                addCharacters()
                listview.adapter = CharactersListviewAdapter(view.context,R.layout.characters_list_item,  listCharacter)
            }
            else{
                addModes()
                listview.adapter = CharactersListviewAdapter(view.context,R.layout.characters_list_item,  listModes)
            }
        }

//        listView.setOnItemClickListener { context, view, position, id ->
//            val element = listview.adapter.getItemAtPosition(position) // The item that was clicked
//
//        }

        container.addView(view, position)
        return view
    }

     fun addWeapons(){
         listWeapon.add(WeaponModel(
             "Rainbow Rifle", R.drawable.ic_sniper_rifle))
         listWeapon.add(WeaponModel(
             "Lavacake AR", R.drawable.ic_sniper_rifle))
         listWeapon.add(WeaponModel(
             "Butterfly Carbine", R.drawable.ic_sniper_rifle))
         listWeapon.add(WeaponModel(
             "Jack Daniel's Barrel Shotgun", R.drawable.ic_sniper_rifle))
         listWeapon.add(WeaponModel(
             "FP6 Classic", R.drawable.ic_sniper_rifle))
         listWeapon.add(WeaponModel(
             "Corona Destroyer", R.drawable.ic_sniper_rifle))
         listWeapon.add(WeaponModel(
             "Camper's Snipez", R.drawable.ic_sniper_rifle))
         listWeapon.add(WeaponModel(
             "Gold Sniper", R.drawable.ic_sniper_rifle))
         listWeapon.add(WeaponModel(
             "Nuketown 2020", R.drawable.ic_sniper_rifle))
         listWeapon.add(WeaponModel(
             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))
//         listWeapon.add(WeaponModel(
//             "Nuketown 2020", R.drawable.ic_sniper_rifle))


     }
    fun addCharacters(){
        listCharacter.add(CharacterSkinModel(
            "Santa's Little Helper", R.drawable.ic_soldier))
        listCharacter.add(CharacterSkinModel(
            "Old Pedro Boy", R.drawable.ic_soldier))
        listCharacter.add(CharacterSkinModel(
            "PewDiePie", R.drawable.ic_soldier))
    }

    fun addModes(){
        listModes.add(CharacterSkinModel(
            "Christmas Special", R.drawable.ic_christmas_mode))
        listModes.add(CharacterSkinModel(
            "Ancient Desert", R.drawable.ic_collection_icon
        ))

    }



    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}