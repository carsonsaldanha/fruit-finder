package com.jrtc.fruitfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jrtc.fruitfinder.adapter.FruitCardAdapter
import com.jrtc.fruitfinder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Sets up view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sets up recycler view
        binding.gridRecyclerView.adapter = FruitCardAdapter(applicationContext)

        // Specifies fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)
    }

    fun sendData(view: View) {
        val intent = Intent(this,FruitActivity::class.java).apply {
            putExtra("name", binding.fruitName.text.toString())
        }
        startActivity(intent)
    }

}