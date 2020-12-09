package com.example.warpinvasion30

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class CharactersPageFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_characters_page, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listview = view.findViewById<ListView>(R.id.charactersListView)

        var list = mutableListOf<CharacterSkinModel>()

        list.add(CharacterSkinModel(
            "Santa's Little Helper", R.drawable.ic_soldier))
        list.add(CharacterSkinModel(
            "Old Pedro Boy", R.drawable.ic_soldier))
        list.add(CharacterSkinModel(
            "PewDiePie", R.drawable.ic_soldier))
        list.add(CharacterSkinModel(
            "Special Ops", R.drawable.ic_soldier))
        list.add(CharacterSkinModel(
            "Special Ops", R.drawable.ic_soldier))
        list.add(CharacterSkinModel(
            "Special Ops", R.drawable.ic_soldier))
        list.add(CharacterSkinModel(
            "Special Ops", R.drawable.ic_soldier))

        listview.adapter = CharactersListviewAdapter(view.context,R.layout.characters_list_item,  list)
    }
}
