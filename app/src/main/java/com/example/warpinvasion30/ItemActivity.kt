package com.example.warpinvasion30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_item.*

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val mIntent= Intent(this, RewardsActivity2::class.java)

        val name = intent.getStringExtra("weaponName")
        val image = intent.getIntExtra("image", R.drawable.ic_sniper_rifle)
        weaponIcon.setImageResource(image)

        weaponName.text = name
        cancelButton.setOnClickListener {
            startActivity(mIntent)
        }

        confirmButton.setOnClickListener {
            Toast.makeText(this, "Item equipped", Toast.LENGTH_SHORT).show()
            startActivity(mIntent)
        }

    }
}