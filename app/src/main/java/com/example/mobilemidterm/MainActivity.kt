package com.example.mobilemidterm

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton = findViewById<ImageView>(R.id.nextButton)
        val profileButton = findViewById<ImageView>(R.id.profileButton)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)

        val intent = Intent(this, MainActivity2::class.java)

        nextButton.setOnClickListener {
            if (nameEditText.text.toString().isNotEmpty()) {
                this.getSharedPreferences("mySharedPreferences", Context.MODE_PRIVATE).edit()
                    .putString("name", nameEditText.text.toString()).apply()
            }
            startActivity(intent)
        }
        profileButton.setOnClickListener {
            startActivity(intent)
        }
    }
}