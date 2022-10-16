package com.example.bankingapp.domain.repository

import com.example.bankingapp.domain.model.Account
import com.example.bankingapp.domain.model.AccountDetails

interface Repository {

    fun getAccountsDB(): List<Account>

    fun getAccountDetailsDB(id: Int): AccountDetails
}