package com.jenugumpu.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey
    val userId: String,
    val email: String,
    val phoneNumber: String = "",
    val displayName: String = "",
    val profileImageUrl: String = "",
    val userType: String = "PRODUCER", // PRODUCER, BUYER, ADMIN
    val gender: String = "",
    val village: String = "",
    val district: String = "",
    val state: String = "",
    val bankAccountNumber: String = "",
    val ifscCode: String = "",
    val notificationsEnabled: Boolean = true,
    val languagePreference: String = "kn", // Kannada default
    val totalHarvestedKg: Double = 0.0,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)