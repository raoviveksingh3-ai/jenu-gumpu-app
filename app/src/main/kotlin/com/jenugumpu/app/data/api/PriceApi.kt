package com.jenugumpu.app.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface PriceApi {
    @GET("/api/honey-prices")
    suspend fun getHoneyPrices(
        @Query("grade") grade: String? = null
    ): PriceSummaryResponse

    @GET("/api/market-trends")
    suspend fun getMarketTrends(): MarketTrendResponse

    @GET("/api/location-prices")
    suspend fun getLocationPrices(
        @Query("location") location: String
    ): LocationPriceResponse
}

data class PriceSummaryResponse(
    val retailPrice: Double,
    val wholesalePrice: Double,
    val avgMarketPrice: Double,
    val updateTime: Long
)

data class MarketTrendResponse(
    val trend: String, // UP, DOWN, STABLE
    val percentageChange: Double,
    val period: String
)

data class LocationPriceResponse(
    val location: String,
    val prices: List<PriceData>
)

data class PriceData(
    val grade: String,
    val price: Double,
    val quantity: Double
)