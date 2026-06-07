package com.jenugumpu.app.domain.model

data class User(
    val userId: String,
    val email: String,
    val phoneNumber: String = "",
    val displayName: String = "",
    val profileImageUrl: String = "",
    val userType: UserType = UserType.PRODUCER,
    val gender: String = "",
    val village: String = "",
    val district: String = "",
    val state: String = "",
    val bankAccountNumber: String = "",
    val ifscCode: String = "",
    val notificationsEnabled: Boolean = true,
    val languagePreference: String = "kn"
)

enum class UserType {
    PRODUCER,
    BUYER,
    ADMIN
}