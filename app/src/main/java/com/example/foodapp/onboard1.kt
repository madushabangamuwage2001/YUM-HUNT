package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboard1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)


        var ob1next = findViewById<Button>(R.id.ob2next)
        ob1next.setOnClickListener {
            var intent = Intent(this,onboard2::class.java)
            startActivity(intent)
            finish()
        }
        var skip1 = findViewById<Button>(R.id.skip3)
        skip1.setOnClickListener {
            var intent = Intent(this,home1::class.java)
            startActivity(intent)
            finish()
        }
    }
}