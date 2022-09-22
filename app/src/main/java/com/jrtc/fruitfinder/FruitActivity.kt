package com.jrtc.fruitfinder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jrtc.fruitfinder.databinding.ActivityFruitBinding

/**
 * Activity for the detailed fruit layout.
 */
class FruitActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFruitBinding

    /**
     * Initializes FruitActivity with activity_fruit layout.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)

        binding = ActivityFruitBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        val strName = intent.getStringExtra("name")

        val quantity = intent.getStringExtra("quantity")

        val fruitImageId = intent.getIntExtra("image", 0)

        val calories = intent.getIntExtra("calories", 0)

        val totalFat = intent.getDoubleExtra("total fat", 0.0)

        val cholesterol = intent.getIntExtra("cholesterol", 0)

        val sodium = intent.getIntExtra("sodium", 0)

        val potassium = intent.getIntExtra("potassium", 0)

        val carbohydrates = intent.getDoubleExtra("total carbohydrates", 0.0)

        val protein = intent.getDoubleExtra("protein", 0.0)

        val vitaminC = intent.getIntExtra("vitamin c", 0)

        val calcium = intent.getIntExtra("calcium", 0)

        binding.fruitName.text = strName
        binding.fruitImage.setImageResource(fruitImageId)
        binding.fruitDescription.text = quantity
    }

}