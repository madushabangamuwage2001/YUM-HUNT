package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class home1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1)

        var homebtnpizza = findViewById<Button>(R.id.homebtnpizza)
        homebtnpizza.setOnClickListener {
            var intent = Intent(this,ordersummary::class.java)
            startActivity(intent)
            finish()
        }

        var profilebtn = findViewById<ImageView>(R.id.profilebtn)
        profilebtn.setOnClickListener {
            var intent = Intent(this,profile::class.java)
            startActivity(intent)
            finish()
        }
    }
}