package com.example.personal_finance_tracker

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.personal_finance_tracker.databinding.ActivityFinanceBinding

class FinanceActivity : AppCompatActivity() {
     private lateinit var binding: ActivityFinanceBinding
     private lateinit var expenseSummary: ExpenseSummary
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFinanceBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
        binding.btnSave.setOnClickListener {
            val category = binding.spCategory.selectedItem.toString()
            val expenseName = binding.etExpenseName.text.toString()
            val expenseAmount = binding.etAmount.text.toString().toDoubleOrNull() ?: 0.0
            binding.btnSave.setOnClickListener {
                val category = binding.spCategory.selectedItem.toString()
                val expenseName = binding.etExpenseName.text.toString()
                val expenseAmount = binding.etAmount.text.toString().toDoubleOrNull() ?: 0.0
                if (expenseName.isNotEmpty() && expenseAmount > 0) {
                expenseSummary = ExpenseSummary(category, expenseName, expenseAmount)

                    Toast.makeText(this@FinanceActivity, "Expense saved successfully", Toast.LENGTH_SHORT).show()
                    binding.etExpenseName.text.clear()
                    binding.etAmount.text.clear()
            }

}}}}


