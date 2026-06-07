package com.jenugumpu.app.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.jenugumpu.app.data.local.dao.HarvestLogDao
import com.jenugumpu.app.data.local.entity.HarvestLogEntity
import com.jenugumpu.app.domain.model.HarvestLog
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class HarvestRepository @Inject constructor(
    private val harvestLogDao: HarvestLogDao,
    private val firestore: FirebaseFirestore
) {

    suspend fun createHarvestLog(harvestLog: HarvestLog): Result<String> {
        return try {
            val entity = harvestLog.toEntity()
            harvestLogDao.insertHarvestLog(entity)
            Result.success(harvestLog.batchId)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun getHarvestLogsByUser(userId: String): Flow<List<HarvestLog>> {
        return harvestLogDao.getHarvestLogsByUserId(userId)
            .map { entities -> entities.map { it.toDomain() } }
    }

    fun getCollectiveStock(): Flow<Double> {
        return harvestLogDao.getCollectiveStockKg()
            .map { it ?: 0.0 }
    }

    suspend fun generateBatchId(): String {
        return "BATCH-${System.currentTimeMillis()}"
    }

    // Helper extension functions
    private fun HarvestLog.toEntity(): HarvestLogEntity {
        return HarvestLogEntity(
            id = this.id,
            userId = this.userId,
            batchId = this.batchId,
            harvestDate = this.harvestDate,
            location = this.location,
            quantity = this.quantity,
            floralSource = this.floralSource,
            grade = this.grade,
            moisturePercentage = this.moisturePercentage,
            colorGrade = this.colorGrade,
            notes = this.notes,
            imageUrl = this.imageUrl
        )
    }

    private fun HarvestLogEntity.toDomain(): HarvestLog {
        return HarvestLog(
            id = this.id,
            userId = this.userId,
            batchId = this.batchId,
            harvestDate = this.harvestDate,
            location = this.location,
            quantity = this.quantity,
            floralSource = this.floralSource,
            grade = this.grade,
            moisturePercentage = this.moisturePercentage,
            colorGrade = this.colorGrade,
            notes = this.notes,
            imageUrl = this.imageUrl
        )
    }
}