package com.jrtc.fruitfinder.model

import androidx.annotation.DrawableRes

/**
 * A data class to represent the information presented in the fruit card
 */
data class Fruit(
    @DrawableRes val imageResourceId: Int,
    val name: String
)