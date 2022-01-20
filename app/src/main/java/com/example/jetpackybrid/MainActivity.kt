package com.example.jetpackybrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var flappy: ImageView
    lateinit var pipes: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        flappy = findViewById(R.id.flappy)
        flappy.
    }
}