package com.example.bankingapp.data.repository

import com.example.bankingapp.domain.model.Account
import com.example.bankingapp.domain.model.AccountDetails
import com.example.bankingapp.domain.repository.Repository

class RepositoryImpl : Repository{
    override fun getAccountsDB(): List<Account> {
        TODO("Not yet implemented")
    }

    override fun getAccountDetailsDB(id: Int): AccountDetails {
        TODO("Not yet implemented")
    }
}