package com.jenugumpu.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF8B6F47),
    onPrimary = Color.White,
    secondary = Color(0xFFFFD700),
    onSecondary = Color.Black,
    tertiary = Color(0xFF4CAF50),
    background = Color(0xFF1F1F1F),
    surface = Color(0xFF2A2A2A)
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF8B6F47),
    onPrimary = Color.White,
    secondary = Color(0xFFFFD700),
    onSecondary = Color.Black,
    tertiary = Color(0xFF4CAF50),
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE)
)

@Composable
fun JenuGumpuTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}