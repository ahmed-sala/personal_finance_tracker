package com.example.personal_finance_tracker

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        Log.d("SplashActivity", "onCreate called, starting MainActivity after delay")

        Handler(Looper.getMainLooper()).postDelayed({
            Log.d("SplashActivity", "Launching MainActivity")
            // Start MainActivity after 3 seconds
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    override fun onStart() {
        super.onStart()
        Log.d("SplashActivity", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SplashActivity", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SplashActivity", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SplashActivity", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SplashActivity", "onDestroy called")
    }
    }
