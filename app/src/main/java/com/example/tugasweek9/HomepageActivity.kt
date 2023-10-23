package com.example.tugasweek9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.tugasweek9.R

class HomepageActivity : AppCompatActivity() {
    private lateinit var tvWelcome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage) // Make sure the layout used is correct

        // Initialize the TextView
        tvWelcome = findViewById(R.id.tvWelcome)

        val username = intent.getStringExtra("USERNAME")

        // Use the received username
        tvWelcome.text = "Selamat Datang, $username!"
    }
}
