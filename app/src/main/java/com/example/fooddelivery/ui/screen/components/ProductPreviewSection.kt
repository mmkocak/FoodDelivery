package com.example.fooddelivery.ui.screen.components

import android.app.ActionBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.fooddelivery.R
import com.example.fooddelivery.data.ProductPreviewState
import com.example.fooddelivery.ui.theme.AppColors
import com.example.fooddelivery.ui.theme.AppTheme

@Composable
fun ProductPreviewSection(
    modifier: Modifier = Modifier,
    state: ProductPreviewState
) {
Box (modifier = modifier.height(IntrinsicSize.Max)){
    ProductBackground(
        modifier = modifier.padding(bottom = 24.dp)
    )
    Content(
        state = state,
        modifier = modifier
            .statusBarsPadding()
            .padding(top = 24.dp)
        )
    }
}

@Composable
private fun ProductBackground(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
        .fillMaxSize()
            .background(color = AppTheme.Colors.secondarySurface,
                shape = RoundedCornerShape(
                    bottomStart = 32.dp,
                    bottomEnd = 32.dp
                )
            )
    )
}
@Composable
private fun Content(
    modifier: Modifier = Modifier,
    state: ProductPreviewState
) {
    ConstraintLayout(modifier = modifier.fillMaxWidth()) {
        val (actionBar, highLights, productImage) = createRefs()
        ActionBar(
            headline = "Mr. Cheezy",
            modifier = modifier
                .padding(horizontal = 18.dp)
                .constrainAs(actionBar) {
                    top.linkTo(parent.top)
                }
            )
        Image(
            painter = painterResource(id = R.drawable.img_burger,),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .height(256.dp)
                .constrainAs(productImage){
                    end.linkTo(parent.end)
                    top.linkTo(anchor = actionBar.bottom, margin = 20.dp)
                }
        )
        ProductHighlights(
            highlights = state.highLights,
            modifier = Modifier.constrainAs(highLights) {
                start.linkTo(anchor = parent.start, margin = 19.dp)
                top.linkTo(productImage.top)
            }
            )
    }
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
        CloseButton()
    }
}
@Composable
private fun CloseButton(modifier: Modifier = Modifier){
    Surface(
        modifier = modifier.size(44.dp),
        shape = RoundedCornerShape(16.dp),
        color = AppTheme.Colors.actionSurface,
        contentColor = AppTheme.Colors.secondarySurface
    ) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = null,
                modifier = Modifier.size(24.dp),
            )
        }
    }
}