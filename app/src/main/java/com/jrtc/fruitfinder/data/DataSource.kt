package com.jrtc.fruitfinder.data

import com.jrtc.fruitfinder.R
import com.jrtc.fruitfinder.model.Fruit

/**
 * An object to generate a static list of fruits
 */
object DataSource {

    val fruits: List<Fruit> = listOf(
        Fruit(
            R.drawable.apple,
            "Apple"
        )
    )

}