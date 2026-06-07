package com.jenugumpu.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "harvest_logs")
data class HarvestLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val userId: String,
    val batchId: String,
    val harvestDate: Long,
    val location: String,
    val quantity: Double, // in KG
    val floralSource: String,
    val grade: String = "", // A, B, C
    val moisturePercentage: Double = 0.0,
    val colorGrade: String = "",
    val notes: String = "",
    val imageUrl: String = "",
    val isSynced: Boolean = false,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)