package com.example.fooddelivery.data

import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

data class ProductFlavorState(
    val name : String,
    val price : String,
    @DrawableRes val imgRes : Int
)
val ProductFlavorData = listOf(
    ProductFlavorState(
        imgRes = R.drawable.img_cheese,
        name = "Cheeder",
        price = "$0.2"
    ),
    ProductFlavorState(
        imgRes = R.drawable.img_bacon,
        name = "Bacon",
        price = "$0.3"
    ),
    ProductFlavorState(
        imgRes = R.drawable.img_onion,
        name = "Onion",
        price = "$0.5"
    )

)