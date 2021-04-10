package com.example.authorization.recyclerviews.recycler_view_components

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.authorization.R
import com.example.authorization.recyclerviews.models.Pizza

class PizzaRVAdapter(
   val items:List<Pizza>
) :RecyclerView.Adapter<PizzaVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaVH {
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_pizza,parent,false)
        return PizzaVH(view)
    }

    override fun getItemCount(): Int=items.size

    override fun onBindViewHolder(holder: PizzaVH, position: Int) {
           holder.bind(items.get(position))
    }

}