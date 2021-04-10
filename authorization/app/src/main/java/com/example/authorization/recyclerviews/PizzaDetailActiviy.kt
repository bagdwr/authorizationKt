package com.example.authorization.recyclerviews

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.authorization.R
import com.example.authorization.recyclerviews.models.Pizza

class PizzaDetailActiviy : AppCompatActivity() {
    companion object{
      private const val EXTRA_PIZZA="EXTRA_PIZZA"
      fun createIntent(context: Context,pizza:Pizza):Intent{
          val intent=Intent(context,PizzaDetailActiviy::class.java)
          intent.putExtra(EXTRA_PIZZA,pizza)
          return intent
      }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_detail)

        val ivPizzaDetail=findViewById<ImageView>(R.id.ivDetail)
        val tvPizzaDetName=findViewById<TextView>(R.id.tvDetailName)
        val tvPizzaDetPrice=findViewById<TextView>(R.id.tvDetailPrice)

        if (intent!=null){
            val pizza:Pizza=intent.getSerializableExtra("EXTRA_PIZZA") as Pizza
            if (pizza!=null){
                Glide.with(this).load(pizza.imageURL).into(ivPizzaDetail)
                tvPizzaDetName.text=pizza.name.toString()
                tvPizzaDetPrice.text=pizza.price.toString()
            }
        }
    }

}