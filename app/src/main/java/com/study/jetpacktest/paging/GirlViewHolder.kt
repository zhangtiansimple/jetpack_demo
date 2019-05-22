package com.study.jetpacktest.paging

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.study.jetpacktest.R
import com.study.jetpacktest.room.Girl


class GirlViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_girl, parent, false)
) {
    private val nameView = itemView.findViewById<TextView>(R.id.name)
    var girl: Girl? = null

    fun bind(girl: Girl?) {
        this.girl = girl
        nameView.text = girl?.name
    }
}