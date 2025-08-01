package com.example.personal_finance_tracker

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.personal_finance_tracker.databinding.ActivityFinanceBinding

class FinanceActivity : AppCompatActivity() {
     private lateinit var binding: ActivityFinanceBinding
     private lateinit var spinnerCategory: Spinner
     private lateinit var etExpenseName: EditText
     private lateinit var etExpenseAmount: EditText
     private lateinit var btnSave: Button
     private lateinit var expenseSummary: ExpenseSummary
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFinanceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        spinnerCategory= binding.spCategory
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
        spinnerCategory.adapter = adapter
        etExpenseName = binding.etExpenseName
        etExpenseAmount = binding.etAmount
        btnSave = binding.btnSave
        btnSave.setOnClickListener {
            val category = spinnerCategory.selectedItem.toString()
            val expenseName = etExpenseName.text.toString()
            val expenseAmount = etExpenseAmount.text.toString().toDoubleOrNull() ?: 0.0
            if (expenseName.isNotEmpty() && expenseAmount > 0) {
                expenseSummary = ExpenseSummary(category, expenseName, expenseAmount)
                // add implicit intent here
                etExpenseName.text.clear()
                etExpenseAmount.text.clear()
            }
        }


    }
}


