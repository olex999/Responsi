package com.example.responsi_086

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListFood (private val listFood: ArrayList<Food>) : RecyclerView.Adapter<ListFood.FoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
    val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_food, parent, false)
    return FoodViewHolder(view)
}

override fun getItemCount(): Int {
    return listFood.size
}

override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
    val food = listFood[position]
    holder.tvName.text = food.name
    holder.tvDetail.text = food.detail
    Glide.with(holder.itemView.context)
        .load(food.poster)
        .into(holder.imgPoster)

    holder.itemView.setOnClickListener(){
        Toast.makeText(
            holder.itemView.context,"Kamu pilih"+listFood[holder.adapterPosition].name, Toast.LENGTH_LONG
        ).show()
    }
}

inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
    var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
}
}