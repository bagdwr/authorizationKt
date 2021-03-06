package com.example.authorization.recyclerviews.recycler_view_components

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.authorization.R
import com.example.authorization.recyclerviews.models.Pizza

class PizzaVH(
    val view:View,
    val clickListener:(Pizza)->Unit
) :RecyclerView.ViewHolder(view){
     fun bind(pizza: Pizza){
         val tvPizzaName:TextView=view.findViewById(R.id.pizzaName)
         val tvPizzaPrice:TextView=view.findViewById(R.id.pizzaPrice)
         var ivPizza:ImageView=view.findViewById(R.id.ivPizza)

         tvPizzaName.text=pizza.name.toString()
         tvPizzaPrice.text= pizza.price.toString()

         Glide.with(view).load(pizza.imageURL).into(ivPizza)

         view.setOnClickListener{
              clickListener.invoke(pizza)
         }
     }
}