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
        val resources = applicationContext?.resources

        val strName = intent.getStringExtra("name")
        val fruitImageId = intent.getIntExtra("image", 0)
        val quantity = intent.getStringExtra("quantity")
        val calories = intent.getIntExtra("calories", 0)
        val totalFat = intent.getDoubleExtra("total fat", 0.0)
        val cholesterol = intent.getIntExtra("cholesterol", 0)
        val sodium = intent.getIntExtra("sodium", 0)
        val potassium = intent.getIntExtra("potassium", 0)
        val totalCarbohydrate = intent.getDoubleExtra("total carbohydrate", 0.0)
        val protein = intent.getDoubleExtra("protein", 0.0)
        val vitaminC = intent.getIntExtra("vitamin c", 0)
        val calcium = intent.getIntExtra("calcium", 0)

        binding.fruitName.text = strName
        binding.fruitImage.setImageResource(fruitImageId)
        binding.quantity.text = quantity
        binding.calories.text = resources?.getString(R.string.calories, calories.toString())
        binding.totalFat.text = resources?.getString(R.string.total_fat, totalFat.toString())
        binding.cholesterol.text =
            resources?.getString(R.string.cholesterol, cholesterol.toString())
        binding.sodium.text = resources?.getString(R.string.sodium, sodium.toString())
        binding.potassium.text = resources?.getString(R.string.potassium, potassium.toString())
        binding.totalCarbohydrate.text =
            resources?.getString(R.string.total_carbohydrate, totalCarbohydrate.toString())
        binding.protein.text = resources?.getString(R.string.protein, protein.toString())
        binding.vitaminC.text = resources?.getString(R.string.vitamin_c, vitaminC.toString())
        binding.calcium.text = resources?.getString(R.string.calcium, calcium.toString())
    }

}