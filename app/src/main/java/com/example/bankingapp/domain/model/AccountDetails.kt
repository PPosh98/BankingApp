package com.example.bankingapp.domain.model

data class AccountDetails(
    val id: Int,
    val name: String,
    val type: String,
    val balance: Float,
    val withdrawals: List<Withdrawal>,
    val deposits: List<Deposit>,
    val payments: List<Payment>,
    val transfers: List<Transfer>
)
