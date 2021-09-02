package com.example.cryptoapp.repository

import com.example.cryptoapp.api.CurrencyService
import javax.inject.Inject

class CryptoRepo @Inject constructor(private val api: CurrencyService)  {

    suspend fun getCryptos()=api.getCryptos("72c18036-f5ee-49c0-af40-83528304231b")
}