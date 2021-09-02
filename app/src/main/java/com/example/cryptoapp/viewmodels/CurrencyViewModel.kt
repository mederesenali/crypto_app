package com.example.cryptoapp.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptoapp.model.Currency
import com.example.cryptoapp.repository.CryptoRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

import javax.inject.Inject

@HiltViewModel
class CurrencyViewModel @Inject constructor(private val repo: CryptoRepo):ViewModel() {

    val listData= MutableLiveData<Currency>()


    val weatherResponse: LiveData<Currency>
        get() = listData


    init {
        getCryptos()
    }

    private fun getCryptos() = CoroutineScope(Dispatchers.IO).launch {
        withContext(Dispatchers.Main){
            val response=repo.getCryptos()
            if(response.isSuccessful){
                listData.postValue(response.body())
            }else{
                Log.d("API RESPONSE","CAN'T LOAD DATA'S")
            }
        }


    }
}