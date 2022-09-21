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

        binding.textView.text = strName
    }

}