package com.jenugumpu.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import com.jenugumpu.app.ui.navigation.JenuGumpuApp
import com.jenugumpu.app.ui.theme.JenuGumpuTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JenuGumpuTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    JenuGumpuApp()
                }
            }
        }
    }
}