package com.example.fooddelivery.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext


@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {

    CompositionLocalProvider(LocalAppColors provides ExtendedColor, LocalAppTypography provides ExtendedTypography) {
        MaterialTheme(
            content = content
        )
    }

}
object  AppTheme{
    val Colors : AppColors
    @Composable
    get() = LocalAppColors.current
    val Typography : AppTypography
    @Composable
    get() = LocalAppTypography.current
}