package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ordersummary : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordersummary)

        var paynowbtn = findViewById<Button>(R.id.paynowbtn)
        paynowbtn.setOnClickListener {
            var intent = Intent(this,selectcard::class.java)
            startActivity(intent)
            finish()
        }
        var back4 = findViewById<ImageView>(R.id.back6)
        back4.setOnClickListener {
            var intent = Intent(this,home1::class.java)
            startActivity(intent)
            finish()
        }
    }
}