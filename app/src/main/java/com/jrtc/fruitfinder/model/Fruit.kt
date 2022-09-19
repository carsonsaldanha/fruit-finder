package com.jrtc.fruitfinder.model

import androidx.annotation.DrawableRes

data class Fruit(
    @DrawableRes val imageResourceId: Int,
    val name: String
)