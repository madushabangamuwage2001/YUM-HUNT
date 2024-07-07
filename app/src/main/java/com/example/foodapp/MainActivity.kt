package com.example.foodapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView

class
MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        handler.postDelayed({
            val intent = Intent(this,onboard1::class.java)
            startActivity(intent)
            finish()
        },2000L)

    }
}