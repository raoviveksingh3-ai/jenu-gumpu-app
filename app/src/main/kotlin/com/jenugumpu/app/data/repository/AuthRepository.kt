package com.jenugumpu.app.data.repository

import com.google.firebase.auth.FirebaseAuth
import com.jenugumpu.app.domain.model.User
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) {

    suspend fun signUpWithEmail(email: String, password: String): Result<String> {
        return try {
            val result = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            Result.success(result.user?.uid ?: "")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun signInWithEmail(email: String, password: String): Result<String> {
        return try {
            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            Result.success(result.user?.uid ?: "")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun sendOTP(phoneNumber: String): Result<String> {
        return try {
            // This would use PhoneAuthProvider in actual implementation
            Result.success("OTP sent to $phoneNumber")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun verifyOTP(verificationId: String, otp: String): Result<String> {
        return try {
            // Verify OTP logic here
            Result.success("OTP verified")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun getCurrentUser(): User? {
        return firebaseAuth.currentUser?.let {
            User(
                userId = it.uid,
                email = it.email ?: "",
                displayName = it.displayName ?: ""
            )
        }
    }

    suspend fun signOut(): Result<Unit> {
        return try {
            firebaseAuth.signOut()
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun isUserLoggedIn(): Boolean = firebaseAuth.currentUser != null
}