package com.experiments.jagsaund.playground.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.experiments.jagsaund.playground.R

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    companion object {
        private val colors = intArrayOf(
                R.color.itemOne,
                R.color.itemTwo,
                R.color.itemThree,
                R.color.itemFour,
                R.color.itemFive,
                R.color.itemSix,
                R.color.itemSeven)

        fun create(parent: ViewGroup): ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return ViewHolder(inflater.inflate(R.layout.view_item, parent, false))
        }
    }

    fun bind(item: Int) {
        itemView.setBackgroundResource(colors[item % colors.size])
    }
}