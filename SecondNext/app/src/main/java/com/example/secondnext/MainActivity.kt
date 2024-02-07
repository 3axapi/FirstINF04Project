package com.example.secondnext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myImg: ImageView = findViewById(R.id.myImg)
        myImg.setOnClickListener {
            val dogImage: Int = R.drawable.dog
            myImg.setImageResource(dogImage)
            myImg.contentDescription = "to jest BlackDog"
        }
    }
}