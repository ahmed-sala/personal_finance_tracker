package com.example.personal_finance_tracker

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.personal_finance_tracker.databinding.ActivityFinanceBinding
import android.util.Log

class FinanceActivity : AppCompatActivity() {
     private lateinit var binding: ActivityFinanceBinding
     private lateinit var expenseSummary: ExpenseSummary
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFinanceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("FinanceActivity", "onCreate called")

        val categories =  listOf(
            "Food",
            "Transport",
            "Entertainment",
            "Utilities",
            "Health",
            "Education",
            "Shopping",
            "Other"
        )
        val adapter = ArrayAdapter(this@FinanceActivity, android.R.layout.simple_spinner_item, categories)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spCategory .adapter = adapter
        Log.d("FinanceActivity", "Categories loaded in spinner")
        binding.btnSave.setOnClickListener {
            binding.btnSave.setOnClickListener {
                val category = binding.spCategory.selectedItem.toString()
                val expenseName = binding.etExpenseName.text.toString()
                val expenseAmount = binding.etAmount.text.toString().toDoubleOrNull() ?: 0.0
                if (expenseName.isNotEmpty() && expenseAmount > 0) {
                expenseSummary = ExpenseSummary(category, expenseName, expenseAmount)
                    Log.d("FinanceActivity", "Expense saved: $expenseSummary")

                    Toast.makeText(this@FinanceActivity, "Expense saved successfully", Toast.LENGTH_SHORT).show()
                    binding.etExpenseName.text.clear()
                    binding.etAmount.text.clear()
                } else {
                    Log.w(
                        "FinanceActivity",
                        "Invalid input: name='$expenseName', amount=$expenseAmount"
                    )
                    Toast.makeText(this, "Please enter valid details", Toast.LENGTH_SHORT).show()
                }

}}}

    override fun onStart() {
        super.onStart()
        Log.d("FinanceActivity", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FinanceActivity", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FinanceActivity", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FinanceActivity", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FinanceActivity", "onDestroy called")
    }
}

