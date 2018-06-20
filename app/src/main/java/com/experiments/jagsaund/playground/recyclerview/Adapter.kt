package com.experiments.jagsaund.playground.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup


class Adapter : RecyclerView.Adapter<ViewHolder>() {
    private val items = (1..50).toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder.create(parent)

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }
}