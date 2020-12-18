package com.example.warpinvasion30

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView

class WeaponsListviewAdapter(var mCtx: Context, var resources:Int, var items:List<WeaponModel>) :
ArrayAdapter<WeaponModel>(mCtx, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.weaponImage)
        val title:TextView = view.findViewById(R.id.tvWeapon)

        var mItem: WeaponModel = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        title.text = mItem.title

        view.setOnClickListener{

            val dialog = MaterialDialog(context)
                .customView(R.layout.dialog_layout)
            dialog.show( )

//          val cancelButton=  view.findViewById<Button>(R.id.cancelButtonDialog)
//            cancelButton.setOnClickListener{
//                dialog.cancel()
//            }
//
//            val confirmButton=  view.findViewById<Button>(R.id.confirmButtonDialog)
//            confirmButton.setOnClickListener{
//                dialog.cancel()
//            }
        }
        return view

    }

    private fun showDialog(){

    }


}