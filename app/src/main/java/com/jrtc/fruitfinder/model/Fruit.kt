package com.jrtc.fruitfinder.model

import androidx.annotation.DrawableRes

/** A data class to represent the information presented in the fruit card. */
data class Fruit(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val calories: Int,
    val totalFat: Double,
    val cholesterol: Int,
    val sodium: Int,
    val potassium: Int,
    val totalCarbohydrate: Int,
    val protein: Double,
    val vitaminC: Int,
    val calcium: Int
)