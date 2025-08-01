package com.example.personal_finance_tracker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvWelcome: TextView
    private lateinit var btnTrack: Button
    private lateinit var btnShare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvWelcome = findViewById(R.id.welcomTv)

        btnTrack = findViewById(R.id.btnTrack)
        btnShare = findViewById(R.id.btnShare)


        btnTrack.setOnClickListener {

        }

        btnShare.setOnClickListener {

        }
    }
}
