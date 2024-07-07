package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class selectcard : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectcard)

        var master = findViewById<ImageView>(R.id.master)
        master.setOnClickListener {
            var intent = Intent(this,success::class.java)
            startActivity(intent)
            finish()
        }
        var visa = findViewById<ImageView>(R.id.visa)
        visa.setOnClickListener {
            var intent = Intent(this,success::class.java)
            startActivity(intent)
            finish()
        }
        var back6 = findViewById<ImageView>(R.id.back6)
        back6.setOnClickListener {
            var intent = Intent(this,ordersummary::class.java)
            startActivity(intent)
            finish()
        }

    }
}