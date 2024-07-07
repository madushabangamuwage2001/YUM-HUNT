package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboard2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)

        var ob2next = findViewById<Button>(R.id.ob2next)
        ob2next.setOnClickListener {
            var intent = Intent(this,onboard3::class.java)
            startActivity(intent)
            finish()
        }
        var skip2 = findViewById<Button>(R.id.skip2)
        skip2.setOnClickListener {
            var intent = Intent(this,home1::class.java)
            startActivity(intent)
            finish()
        }
    }
}