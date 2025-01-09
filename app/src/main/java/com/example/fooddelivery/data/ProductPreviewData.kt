package com.example.fooddelivery.data

import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

data class ProductHighLightState(
    val text : String,
    val type : ProductHighLightType
)
enum class ProductHighLightType{
    PRIMARY, SECONDARY
}
data class ProductPreviewState(
    val headline : String = "Mr. Cheezy",
    @DrawableRes val PreviewImage : Int = R.drawable.img_burger,
    val highLights : List<ProductHighLightState> = listOf(
        ProductHighLightState(
            text = "Classic Taste",
            type = ProductHighLightType.SECONDARY
        ),
        ProductHighLightState(
            text = "Bestseller",
            type = ProductHighLightType.PRIMARY
        ),

    )
)