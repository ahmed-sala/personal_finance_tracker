package com.example.personal_finance_tracker
import android.util.Log

data class ExpenseSummary(
    val category: String,
    val expenseName: String,
    val expenseAmount: Double,
)
{
    init {
        Log.d("ExpenseSummary", "Created: category=$category, name=$expenseName, amount=$expenseAmount")
    } }
