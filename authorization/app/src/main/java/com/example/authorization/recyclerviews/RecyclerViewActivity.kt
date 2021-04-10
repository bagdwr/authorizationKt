package com.example.authorization.recyclerviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.authorization.R
import com.example.authorization.recyclerviews.models.Pizza
import com.example.authorization.recyclerviews.recycler_view_components.PizzaRVAdapter

class RecyclerViewActivity: AppCompatActivity() {
    private val pizzas= listOf<Pizza>(
        Pizza("Pomidor",2000,""),
        Pizza("Ananas",3000,""),
        Pizza("Vegetables",2300,""),
        Pizza("Gribi",1400,""),
        Pizza("Maionez",3000,""),
        Pizza("Peperoni",1550,""),
        Pizza("Pomidor2",1900,"")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerViewPizza=findViewById<RecyclerView>(R.id.rv)
        recyclerViewPizza.layoutManager=LinearLayoutManager(this)
        recyclerViewPizza.adapter=PizzaRVAdapter(pizzas)
    }
}