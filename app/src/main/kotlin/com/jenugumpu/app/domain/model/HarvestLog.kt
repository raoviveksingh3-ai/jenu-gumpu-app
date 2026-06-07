package com.jenugumpu.app.domain.model

data class HarvestLog(
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
    val imageUrl: String = ""
)

enum class HoneyGrade {
    GRADE_A,
    GRADE_B,
    GRADE_C
}

enum class FloralSource {
    COFFEE_BLOSSOM,
    WILDFLOWER,
    EUCALYPTUS,
    ACACIA,
    NEEM,
    OTHER
}