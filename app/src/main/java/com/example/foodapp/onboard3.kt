package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboard3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)

        var ob3next = findViewById<Button>(R.id.skip2)
        ob3next.setOnClickListener {
            var intent = Intent(this,signin::class.java)
            startActivity(intent)
            finish()
        }
        var skip3 = findViewById<Button>(R.id.skip3)
        skip3.setOnClickListener {
            var intent = Intent(this,home1::class.java)
            startActivity(intent)
            finish()
        }
    }
}