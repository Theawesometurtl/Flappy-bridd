package com.example.jetpackybrid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class StartActivity : AppCompatActivity() {

    lateinit var startBtn: Button
    lateinit var flappy: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        startBtn = findViewById(R.id.startBtn)
        flappy = findViewById(R.id.flappy)

        startBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}