package com.example.bankingapp.domain.model

data class Account(
    val id: Int,
    val name: String,
    val type: String,
    val balance: Float,
)
