package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class signin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        var bts1 = findViewById<Button>(R.id.bts1)
        bts1.setOnClickListener {
            var intent = Intent(this,home1::class.java)
            startActivity(intent)
            finish()
        }
        var signinsignupbtn = findViewById<TextView>(R.id.signinsignupbtn)
        signinsignupbtn.setOnClickListener {
            var intent = Intent(this,signup::class.java)
            startActivity(intent)
            finish()
        }
    }
}