package com.example.bankingapp.domain.model

import java.util.*

data class Deposit(
    val date: Date,
    val thenBalance: Float,
    val amount: Float
)
