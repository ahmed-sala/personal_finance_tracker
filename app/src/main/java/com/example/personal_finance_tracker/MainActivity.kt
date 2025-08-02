package com.example.personal_finance_tracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.personal_finance_tracker.databinding.ActivityMainBinding
import android.util.Log


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    lateinit var expenseSummary: ExpenseSummary

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate called")


        binding=ActivityMainBinding.inflate(layoutInflater)
        binding.btnTrack.setOnClickListener {
            Log.d("MainActivity", "Navigating to FinanceActivity")

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
            Log.d("MainActivity", "Sharing expense: $summary")
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }

    }

    }

