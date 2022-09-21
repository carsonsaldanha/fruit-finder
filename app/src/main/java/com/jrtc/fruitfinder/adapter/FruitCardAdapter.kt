package com.jrtc.fruitfinder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jrtc.fruitfinder.R
import com.jrtc.fruitfinder.data.DataSource
import com.jrtc.fruitfinder.model.Fruit

/**
 * Adapter to inflate the grid list item layout and populate the view with information
 * from the fruit data source.
 */
class FruitCardAdapter(private val onItemClicked: (Fruit) -> Unit) :
    RecyclerView.Adapter<FruitCardAdapter.FruitCardViewHolder>() {

    // Initializes the data using the fruit list data source
    private val fruitList = DataSource.fruits

    /**
     * ViewHolder for Fruit which takes in the inflated view and the onClick behavior.
     * Provides a reference to the type of views being used.
     */
    class FruitCardViewHolder(itemView: View, val onClick: (Fruit) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        private val fruitImageView: ImageView = itemView.findViewById(R.id.fruit_image)
        private val fruitNameTextView: TextView = itemView.findViewById(R.id.fruit_name)
        private var currentFruit: Fruit? = null

        /** Sets an onClickListener on each fruit item in the list. */
        init {
            itemView.setOnClickListener {
                currentFruit?.let {
                    onClick(it)
                }
            }
        }

        /** Binds the fruit name and image. */
        fun bind(fruit: Fruit) {
            currentFruit = fruit

            fruitNameTextView.text = fruit.name
            fruitImageView.setImageResource(fruit.imageResourceId)
        }

    }

    /** Creates and inflates view and returns FruitCardViewHolder. */
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): FruitCardViewHolder {
        // Creates a new view, which defines the UI of the grid list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.grid_list_item, viewGroup, false)
        return FruitCardViewHolder(view, onItemClicked)
    }

    /** Gets current fruit and uses it to bind view. */
    override fun onBindViewHolder(holder: FruitCardViewHolder, position: Int) {
        // Gets a fruit from the dataset at this position and replaces the
        // contents of the view with that element
        val fruit = fruitList[position]
        holder.bind(fruit)
    }

    /** Returns the size of the data set. */
    override fun getItemCount(): Int {
        return fruitList.size
    }

}