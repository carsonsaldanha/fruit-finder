package com.jrtc.fruitfinder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jrtc.fruitfinder.adapter.FruitCardAdapter
import com.jrtc.fruitfinder.databinding.ActivityMainBinding
import com.jrtc.fruitfinder.model.Fruit

/**
 * Activity for the main grid layout.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    /**
     * Initializes MainActivity with activity_main layout.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Sets up view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sets up recycler view with onClick behavior
        binding.gridRecyclerView.adapter = FruitCardAdapter{ fruit -> adapterOnClick(fruit) }

        // Specifies fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)
    }

    /**
     * Opens FruitActivity when a RecyclerView item is clicked.
     */
    private fun adapterOnClick(fruit: Fruit) {
        val intent = Intent(this, FruitActivity()::class.java)
        intent.putExtra("name", fruit.name)
        intent.putExtra("image", fruit.imageResourceId)
        startActivity(intent)
    }

}