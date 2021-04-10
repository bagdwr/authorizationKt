package com.example.authorization.recyclerviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.authorization.R

class RecyclerViewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerViewPizza=findViewById<RecyclerView>(R.id.rv)
        recyclerViewPizza.layoutManager=LinearLayoutManager(this)

    }
}