package com.example.mobilemidterm

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name = this.getSharedPreferences("mySharedPreferences", Context.MODE_PRIVATE).getString("name", "your name")
        findViewById<TextView>(R.id.nameTextView).text = "Hello, $name"

        findViewById<ImageView>(R.id.backButton).setOnClickListener {
            finish()
        }
    }
}