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

class FruitCardAdapter(private val context: Context?) :
    RecyclerView.Adapter<FruitCardAdapter.FruitCardViewHolder>() {

    private val fruitList = DataSource.fruits

    class FruitCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val fruitImageView: ImageView? = view!!.findViewById(R.id.fruit_image)
        val fruitNameTextView: TextView? = view!!.findViewById(R.id.fruit_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitCardViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
        return FruitCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

    override fun onBindViewHolder(holder: FruitCardViewHolder, position: Int) {
        val fruitData = fruitList[position]
        holder.fruitImageView?.setImageResource(fruitData.imageResourceId)
        holder.fruitNameTextView?.text = fruitData.name
    }

}