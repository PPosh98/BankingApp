package com.example.bankingapp.domain.model

import java.util.*

data class Transfer(
    val date: Date,
    val thenBalance: Float,
    val amount: Float
)
