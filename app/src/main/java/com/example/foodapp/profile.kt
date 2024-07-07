package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var prohome = findViewById<ImageView>(R.id.prohome)
        prohome.setOnClickListener {
            var intent = Intent(this,home1::class.java)
            startActivity(intent)
            finish()
        }
        var orderhis = findViewById<TextView>(R.id.orderhis)
        orderhis.setOnClickListener {
            var intent = Intent(this,orderhistory::class.java)
            startActivity(intent)
            finish()
        }
    }
}