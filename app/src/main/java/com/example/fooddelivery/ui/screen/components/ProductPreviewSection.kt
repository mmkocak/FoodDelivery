package com.example.fooddelivery.ui.screen.components

import android.app.ActionBar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.fooddelivery.ui.theme.AppColors
import com.example.fooddelivery.ui.theme.AppTheme

@Composable
fun ProductPreviewSection(
    modifier: Modifier = Modifier
) {

}
@Composable
private fun ActionBar(
    modifier: Modifier = Modifier,
    headline: String
) {
    Row (
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
    Text(
        text = headline,
        style = AppTheme.Typography.headLine, color = AppTheme.Colors.onSecondarySurface,
        )
    }
}