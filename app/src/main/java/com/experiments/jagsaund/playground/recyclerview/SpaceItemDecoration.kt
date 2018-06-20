package com.experiments.jagsaund.playground.recyclerview

import android.content.Context
import android.graphics.Rect
import android.support.annotation.DimenRes
import android.support.v7.widget.RecyclerView
import android.view.View

class SpaceItemDecoration(context: Context, @DimenRes private val spaceOffset: Int) : RecyclerView.ItemDecoration() {
    private val space: Int = context.resources.getDimensionPixelSize(spaceOffset)

    override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
    ) {
        if (space == 0) return

        val position = parent.getChildAdapterPosition(view)
        val isFirstItem = position == 0
        val isLastItem = position == parent.adapter.itemCount - 1

        val start: Int
        val end: Int
        when {
            isFirstItem -> {
                start = 0
                end = (space / 2f + 0.5f).toInt()
            }
            isLastItem -> {
                start = (space / 2f + 0.5f).toInt()
                end = 0
            }
            else -> {
                start = (space / 2f + 0.5f).toInt()
                end = (space / 2f + 0.5f).toInt()
            }
        }

        outRect.set(start, 0, end, 0)
    }
}