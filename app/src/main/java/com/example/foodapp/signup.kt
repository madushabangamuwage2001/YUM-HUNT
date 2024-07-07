package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var signup = findViewById<Button>(R.id.signup)
        signup.setOnClickListener {
            var intent = Intent(this,home1::class.java)
            startActivity(intent)
            finish()
        }
    }

}