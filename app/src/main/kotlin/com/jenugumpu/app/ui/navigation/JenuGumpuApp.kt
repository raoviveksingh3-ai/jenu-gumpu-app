package com.jenugumpu.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun JenuGumpuApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            // Login screen placeholder
        }
        composable("dashboard") {
            // Dashboard screen placeholder
        }
        composable("harvest") {
            // Harvest logging screen placeholder
        }
        composable("grading") {
            // AI grading screen placeholder
        }
        composable("prices") {
            // Price monitor screen placeholder
        }
        composable("marketplace") {
            // Marketplace screen placeholder
        }
    }
}