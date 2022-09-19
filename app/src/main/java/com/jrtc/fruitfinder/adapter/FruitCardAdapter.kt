package com.jrtc.fruitfinder.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jrtc.fruitfinder.R
import com.jrtc.fruitfinder.data.DataSource

/**
 * Adapter to inflate the grid list item layout and populate the view with information
 * from the appropriate data source
 */
class FruitCardAdapter(private val context: Context?) :
    RecyclerView.Adapter<FruitCardAdapter.FruitCardViewHolder>() {

    // Initializes the data using the fruits List from DataSource
    private val fruitList = DataSource.fruits

    /**
     * Declares and initialize all of the list item UI components / view elements
     */
    class FruitCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val fruitImageView: ImageView? = view!!.findViewById(R.id.fruit_image)
        val fruitNameTextView: TextView? = view!!.findViewById(R.id.fruit_name)
    }

    /**
     * Inflates the grid list item layout
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitCardViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
        // Passes the inflated layout to the view holder
        return FruitCardViewHolder(adapterLayout)
    }

    /**
     * Returns the size of the data set
     */
    override fun getItemCount(): Int {
        return fruitList.size
    }

    /**
     * Sets the data in each of the recycler view cards
     */
    override fun onBindViewHolder(holder: FruitCardViewHolder, position: Int) {
        // Gets the data at the current position
        val fruitData = fruitList[position]
        // Sets the image resource for the current fruit
        holder.fruitImageView?.setImageResource(fruitData.imageResourceId)
        // Sets the text for the current fruit's name
        holder.fruitNameTextView?.text = fruitData.name
    }

}