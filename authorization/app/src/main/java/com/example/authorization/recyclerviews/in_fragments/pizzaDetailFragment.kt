package com.example.authorization.recyclerviews.in_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.authorization.R
import com.example.authorization.recyclerviews.models.Pizza

class pizzaDetailFragment :Fragment(){

    companion object{
        fun createFragment(pizza:Pizza):pizzaDetailFragment{
           val fragment=pizzaDetailFragment()
           val bundle=Bundle()
            bundle.putSerializable("PIZZA",pizza)
            fragment.arguments=bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_detail, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val ivPizzaDetail=view.findViewById<ImageView>(R.id.ivDetail)
        val tvPizzaDetName=view.findViewById<TextView>(R.id.tvDetailName)
        val tvPizzaDetPrice=view.findViewById<TextView>(R.id.tvDetailPrice)

        if (arguments!=null){
            val pizza:Pizza=arguments?.getSerializable("PIZZA") as Pizza
            if (pizza!=null){
                Glide.with(this).load(pizza.imageURL).into(ivPizzaDetail)
                tvPizzaDetName.text=pizza.name.toString()
                tvPizzaDetPrice.text=pizza.price.toString()
            }
        }
    }
}