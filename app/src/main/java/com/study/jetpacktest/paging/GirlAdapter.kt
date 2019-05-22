package com.study.jetpacktest.paging

import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.study.jetpacktest.room.Girl

class GirlAdapter : PagedListAdapter<Girl, GirlViewHolder>(diffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GirlViewHolder = GirlViewHolder(parent)

    override fun onBindViewHolder(holder: GirlViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<Girl>() {
            override fun areItemsTheSame(oldItem: Girl, newItem: Girl): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Girl, newItem: Girl): Boolean =
                oldItem == newItem
        }
    }
}