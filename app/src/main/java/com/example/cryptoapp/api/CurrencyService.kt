package com.example.cryptoapp.api

import com.example.cryptoapp.model.Currency
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface CurrencyService {


    @GET("v1/cryptocurrency/listings/latest")
   suspend fun getCryptos(
        @Query("X-CMC_PRO_API_KEY") API_KYE: String
   ): Response<Currency>
}