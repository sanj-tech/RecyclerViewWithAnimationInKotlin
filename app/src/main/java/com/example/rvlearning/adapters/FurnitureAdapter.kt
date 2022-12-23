package com.example.rvlearning.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.rvlearning.R
import com.example.rvlearning.databinding.CustomItemViewBinding
import com.example.rvlearning.model.FurnitureModel

class FurnitureAdapter(var context: Context, var list: List<FurnitureModel>) :
    RecyclerView.Adapter<FurnitureAdapter.FurnitureViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FurnitureViewHolder {
        var binding: CustomItemViewBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.custom_item_view, parent, false
            )
        return FurnitureViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FurnitureViewHolder, position: Int) {
        holder.binding.tvName.text = list[position].furnitureName
        holder.binding.ivProfileImage.setImageResource(list[position].furnitureImage)
        holder.binding.container.animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.scale)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class FurnitureViewHolder(val binding: CustomItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

}