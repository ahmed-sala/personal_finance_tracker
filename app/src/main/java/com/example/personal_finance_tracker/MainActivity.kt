package com.example.personal_finance_tracker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.personal_finance_tracker.databinding.ActivityMainBinding
import android.util.Log


class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate called")


        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnTrack.setOnClickListener {
            Log.d(TAG, "Navigating to FinanceActivity")

            val intent = Intent(this, FinanceActivity::class.java)
            startActivity(intent)

        }
        binding.btnShare.setOnClickListener {
            val summary = ExpenseSummary(
                category = "Food",
                expenseName = "Lunch",
                expenseAmount = 10.0
            )

            val shareText = "Name: ${summary.expenseName}\n" +
                    "Category: ${summary.category}\n" +
                    "Amount: \$${summary.expenseAmount}"
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareText)
            shareIntent.type = "text/plain"
            Log.d(TAG, "Sharing expense: $summary")
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
    }


    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
    }

    }

