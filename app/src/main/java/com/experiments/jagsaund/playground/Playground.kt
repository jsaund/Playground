package com.experiments.jagsaund.playground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.experiments.jagsaund.playground.recyclerview.Adapter
import com.experiments.jagsaund.playground.recyclerview.ItemSnapHelper
import com.experiments.jagsaund.playground.recyclerview.SpaceItemDecoration

class Playground : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@Playground, LinearLayoutManager.HORIZONTAL, false)
            adapter = Adapter()
            addItemDecoration(SpaceItemDecoration(this@Playground, R.dimen.divider_space))
        }

        ItemSnapHelper().attachToRecyclerView(recyclerView)
    }

}
