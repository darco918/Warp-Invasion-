package com.example.warpinvasion30

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val cardviewInstagram = findViewById<androidx.cardview.widget.CardView>(R.id.cardviewInstagram)
        cardviewInstagram.setOnClickListener(){

            val url = "https://www.instagram.com/darco_paul/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val cardviewTwitter = findViewById<androidx.cardview.widget.CardView>(R.id.cardviewTwitter)
        cardviewTwitter.setOnClickListener(){

            val url = "https://twitter.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

    }
}