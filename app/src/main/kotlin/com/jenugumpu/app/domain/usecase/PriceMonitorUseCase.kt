package com.jenugumpu.app.domain.usecase

import com.jenugumpu.app.data.api.PriceApi
import com.jenugumpu.app.data.api.PriceSummaryResponse
import javax.inject.Inject

class PriceMonitorUseCase @Inject constructor(
    private val priceApi: PriceApi
) {

    suspend fun getPrices(grade: String?): Result<PriceSummaryResponse> {
        return try {
            val response = priceApi.getHoneyPrices(grade)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun calculateProfit(
        harvestedKg: Double,
        filteringCostPerKg: Double,
        packagingCostPerKg: Double,
        rawHoneyPrice: Double,
        marketPrice: Double
    ): Double {
        val totalCost = harvestedKg * (filteringCostPerKg + packagingCostPerKg)
        val revenue = harvestedKg * marketPrice
        return revenue - totalCost
    }
}