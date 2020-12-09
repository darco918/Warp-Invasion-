package com.example.warpinvasion30

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CharactersListviewAdapter (var mCtx: Context, var resources:Int, var items:List<CharacterSkinModel>) :
    ArrayAdapter<CharacterSkinModel>(mCtx, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.characterImage)
        val title: TextView = view.findViewById(R.id.tvCharacter)

        var mItem: CharacterSkinModel = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        title.text = mItem.title

        return view

    }
}

