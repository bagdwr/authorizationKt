package com.example.authorization.recyclerviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.authorization.R
import com.example.authorization.recyclerviews.models.Pizza
import com.example.authorization.recyclerviews.recycler_view_components.PizzaRVAdapter

class RecyclerViewActivity: AppCompatActivity() {
    private val pizzas= listOf<Pizza>(
        Pizza("Pomidor",2000,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/71322d92-f9dd-4b9d-ab9d-9b08e091d9a7.jpg"),
        Pizza("Ananas",3000,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/b3323707-d6cd-4a66-88aa-fe061f1a45aa.jpg"),
        Pizza("Vegetables",2300,"https://dodopizza-a.akamaihd.net/static/Img/Products/fd45704b214f4fdfaa8f846d1f99d5a8_584x584.jpeg"),
        Pizza("Gribi",1400,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/b3323707-d6cd-4a66-88aa-fe061f1a45aa.jpg"),
        Pizza("Maionez",3000,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/71322d92-f9dd-4b9d-ab9d-9b08e091d9a7.jpg"),
        Pizza("Peperoni",1550,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/e26f610b-8606-429c-b388-ac05cbf6130d.jpg"),
        Pizza("Cheese",1900,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/051969c5-5b4c-414c-8566-3c76001e48c6.jpg"),
        Pizza("Meal",1400,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/b3323707-d6cd-4a66-88aa-fe061f1a45aa.jpg"),
        Pizza("Tomato",3000,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/71322d92-f9dd-4b9d-ab9d-9b08e091d9a7.jpg"),
        Pizza("Bacon",1550,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/e26f610b-8606-429c-b388-ac05cbf6130d.jpg"),
        Pizza("Bread",1900,"https://dodopizza-a.akamaihd.net/static/Img/Products/Pizza/ru-RU/051969c5-5b4c-414c-8566-3c76001e48c6.jpg")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerViewPizza=findViewById<RecyclerView>(R.id.rv)
        recyclerViewPizza.layoutManager=LinearLayoutManager(this)
        recyclerViewPizza.adapter=PizzaRVAdapter(pizzas
        ) {
            val intent=PizzaDetailActiviy.createIntent(this,it)
            startActivity(intent)

        }
        recyclerViewPizza.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))

    }
}