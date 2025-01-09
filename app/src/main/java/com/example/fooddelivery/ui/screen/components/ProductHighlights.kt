package com.example.fooddelivery.ui.screen.components

import android.text.Highlights
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.data.ProductHighLightState
import com.example.fooddelivery.data.ProductHighLightType
import com.example.fooddelivery.ui.theme.AppTheme

@Composable
fun ProductHighlights(
    modifier: Modifier = Modifier,
    highlights: List<ProductHighLightState>
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        highlights.onEach { item ->
             Highlight(
                 text = item.text,
                 color = HighlightDefaults.colors(type = item.type)
            )
        }
    }
}

@Composable
private fun Highlight(
    modifier: Modifier = Modifier,
    text : String,
    color: HighlightColor = HighlightDefaults.defaultColors
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(percent = 50),
        contentColor = color.contentColor,
        color = color.containerColor
    ) {
    Box(modifier = modifier.padding(
        vertical = 10.dp,
        horizontal = 12.dp
         )
        ){
        Text(
            text = text,
            style = AppTheme.Typography.titleSmall,
            fontWeight = FontWeight.Bold,
        )
    }
    }
}
private object HighlightDefaults{
    val defaultColors = HighlightColor(
        contentColor = Color.Unspecified,
        containerColor = Color.Unspecified
    )
    @Composable
    fun colors(type: ProductHighLightType): HighlightColor = when(type){
        ProductHighLightType.PRIMARY -> HighlightColor(
            containerColor = AppTheme.Colors.highLightSurface,
            contentColor = AppTheme.Colors.onHighLightSurface,
        )
        ProductHighLightType.SECONDARY -> HighlightColor(
            containerColor = AppTheme.Colors.actionSurface,
            contentColor = AppTheme.Colors.onActionSurface
        )
    }
}

@Immutable
private  data class HighlightColor(
    val containerColor: Color,
    val contentColor: Color

    )