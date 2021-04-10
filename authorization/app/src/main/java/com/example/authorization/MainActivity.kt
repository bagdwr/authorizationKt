package com.example.authorization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.authorization.recyclerviews.RecyclerViewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button=findViewById<Button>(R.id.loginBtn)
        button.setOnClickListener{
            val loginField=findViewById<EditText>(R.id.loginEdit).text.toString().trim()
            val passField=findViewById<EditText>(R.id.passEdit).text.toString().trim()
            if (loginField.equals("admin") && passField.equals("qweqwe")){
                val intent=Intent(this,
                    RecyclerViewActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Incorrect password",Toast.LENGTH_LONG).show()
            }
        }

        val create=findViewById<TextView>(R.id.underLine)
        create.setOnClickListener{
            Toast.makeText(this,"CREATE textview was pressed",Toast.LENGTH_LONG).show()
        }


    }
}