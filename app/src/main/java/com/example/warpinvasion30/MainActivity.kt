package com.example.warpinvasion30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val layout = findViewById<LinearLayout>(R.id.linear_layout_container)


//
//        menu_bottom.setOnItemSelectedListener {id ->
//
//            when(id) {
//
//
//            }
//        }
    }
}