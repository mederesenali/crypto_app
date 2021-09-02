package com.example.cryptoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cryptoapp.databinding.ActivityMainBinding
import com.example.cryptoapp.ui.CurrencyAdapter
import com.example.cryptoapp.viewmodels.CurrencyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val viewModel: CurrencyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView=binding.recyclerView



        viewModel.weatherResponse.observe(this){
            binding.recyclerView.adapter?.notifyDataSetChanged()
        }

//        viewModel.weatherResponse.observe(this) {
//            recyclerView.adapter = CurrencyAdapter(it)
//            recyclerView.layoutManager = LinearLayoutManager(this)
//            recyclerView.setHasFixedSize(true)
//        }

    }
}