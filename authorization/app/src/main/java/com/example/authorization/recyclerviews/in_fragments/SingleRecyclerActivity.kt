package com.example.authorization.recyclerviews.in_fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.authorization.R

class SingleRecyclerActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_layout)

        supportFragmentManager.beginTransaction()
            .replace(R.id.singleSampleLayout, pizzaListFragment())
            .commit()
    }
}