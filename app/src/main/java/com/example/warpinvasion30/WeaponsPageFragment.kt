package com.example.warpinvasion30

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView


class WeaponsPageFragment : Fragment() {

    val  values = arrayOf("Assault Rifle", "Sniper Rifle", "Pistol", "Pedro","Assault Rifle", "Sniper Rifle", "Pistol", "Pedro","Assault Rifle", "Sniper Rifle", "Pistol", "Pedro")

    private lateinit var recyclerView: RecyclerView
    private lateinit var manager: RecyclerView.LayoutManager
    private lateinit var myAdapter: RecyclerView.Adapter<*>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_weapons_page, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listview = view.findViewById<ListView>(R.id.weaponsListView)

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
    }
}
