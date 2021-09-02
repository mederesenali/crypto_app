package com.example.cryptoapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Currency(

    val data: List<Datum>? = null,
    val status: Status
) : Parcelable {

    @Parcelize
    data class Btc(
        val price: Int,
        @SerializedName("volume_24h")
        val volume24h: Int,
        @SerializedName("percent_change_1h")
        val percentChange1h: Int,
        @SerializedName("percent_change_24h")
        val percentChange24h: Int,
        @SerializedName("percent_change_7d")
        val percentChange7d: Int,
        @SerializedName("market_cap")
        val marketCap: Int,
        @SerializedName("market_cap_dominance")
        val marketCapDominance: Int,
        @SerializedName("fully_diluted_market_cap")
        val fullyDilutedMarketCap: Double,
        @SerializedName("last_updated")
        val lastUpdated: String
    ) : Parcelable

    @Parcelize
    data class Datum(
        val id: Int,
        val name: String,
        val symbol: String,
        val slug: String,
        @SerializedName("cmc_rank")
        val cmcRank: Int,
        @SerializedName("num_market_pairs")
        val numMarketPairs: Int,
        @SerializedName("circulating_supply")
        val circulatingSupply: Int,
        @SerializedName("total_supply")
        val totalSupply: Int,
        @SerializedName("max_supply")
        val maxSupply: Int,
        @SerializedName("last_updated")
        val lastUpdated: String,
        @SerializedName("date_added")
        val dateAdded: String,
        @SerializedName("tags")
        val tags: List<String>? = null,
        //@SerializedName("platform")
        // val platform: Objects,
        @SerializedName("quote")
        val quote: Quote
    ) : Parcelable

    @Parcelize
    data class Eth(
        @SerializedName("price")
        val price: Int,
        @SerializedName("volume_24h")
        val volume24h: Int,
        @SerializedName("percent_change_1h")
        val percentChange1h: Int,
        @SerializedName("percent_change_24h")
        val percentChange24h: Int,
        @SerializedName("percent_change_7d")
        val percentChange7d: Int,
        @SerializedName("market_cap")
        val marketCap: Int,
        @SerializedName("market_cap_dominance")
        val marketCapDominance: Int,
        @SerializedName("fully_diluted_market_cap")
        val fullyDilutedMarketCap: Double,
        @SerializedName("last_updated")
        val lastUpdated: String

    ) : Parcelable

    @Parcelize
    data class Quote(
        @SerializedName("USD")
        val usd: Usd,
        @SerializedName("BTC")
        val btc: Btc,
        @SerializedName("ETH")
        val eth: Eth
    ) : Parcelable

    @Parcelize
    data class Status(
        @SerializedName("timestamp")
        val timestamp: String,
        @SerializedName("error_code")
        val errorCode: Int,
        @SerializedName("error_message")
        val errorMessage: String,
        @SerializedName("elapsed")
        val elapsed: Int,
        @SerializedName("credit_count")
        val creditCount: Int
    ) : Parcelable

    @Parcelize
    data class Usd(
        @SerializedName("price")
        val price: Double,
        @SerializedName("volume_24h")
        val volume24h: Long,
        @SerializedName("percent_change_1h")
        val percentChange1h: Double,
        @SerializedName("percent_change_24h")
        val percentChange24h: Double,
        @SerializedName("percent_change_7d")
        val percentChange7: Double,
        @SerializedName("market_cap")
        val marketCap: Long,
        @SerializedName("market_cap_dominance")
        val marketCapDominance: Int,
        @SerializedName("fully_diluted_market_cap")
        val fullyDilutedMarketCap: Double,
        @SerializedName("last_updated")
        val lastUpdated: String
    ) : Parcelable


}






