package com.example.cryptoapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptoapp.R
import com.example.cryptoapp.model.Currency


class CurrencyAdapter(private val currencyList: Currency):
    RecyclerView.Adapter<CurrencyAdapter.ExampleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.currency_layout,
            parent, false)
        return ExampleViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = currencyList.data?.get(position)
        holder.name.text=currentItem?.name
        holder.symbol.text = currentItem?.symbol
        holder.rate.text = currentItem?.cmcRank.toString()
    }

    inner class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name:TextView=itemView.findViewById(R.id.name)
        val symbol:TextView=itemView.findViewById(R.id.symbol)
        val rate:TextView=itemView.findViewById(R.id.rate)

    }

    override fun getItemCount(): Int =0
}