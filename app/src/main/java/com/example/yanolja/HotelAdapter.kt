package com.example.yanolja

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.yanolja.databinding.HotelItemBinding

class HotelAdapter(
    private val context: Context, private val hotelListArrayList: ArrayList<Hotel>,
) : RecyclerView.Adapter<HotelAdapter.ViewHolder>() {

    class ViewHolder(val binding: HotelItemBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelAdapter.ViewHolder {
        val binding = HotelItemBinding.inflate(
            LayoutInflater.from(context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HotelAdapter.ViewHolder, position: Int) {
//        holder.binding = HotelItemBinding.inflate(inflater, parent, false)
        holder.binding.hotelItemMainIv.setImageResource(hotelListArrayList[position].hotelImg)
        holder.binding.hotelItemTypeIv.setImageResource(hotelListArrayList[position].hotelOptionImg)
        holder.binding.hotelItemName.text = hotelListArrayList[position].hotelName
        holder.binding.hotelItemRatingStarIv.setImageResource(hotelListArrayList[position].starRating)
        holder.binding.hotelItemRatingTv.text = hotelListArrayList[position].rating
        holder.binding.hotelItemGrade.text = hotelListArrayList[position].grade
        holder.binding.hotelItemAuth.setImageResource(hotelListArrayList[position].auth)
        holder.binding.hotelItemPrice.text = hotelListArrayList[position].price
        holder.binding.hotelItemTotalReviewsTvMain.text = hotelListArrayList[position].review
        holder.binding.hotelItemMainIv.background = context.resources.getDrawable(R.drawable.image_rac)
        holder.binding.hotelItemMainIv.clipToOutline=true
    }

    override fun getItemCount(): Int = hotelListArrayList.size

}