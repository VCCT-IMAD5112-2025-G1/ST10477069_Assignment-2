package com.example.myapplicationosamah

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)
        val startButton = findViewById<Button>(R.id.startButton)

        // Set welcome message and description
        welcomeTextView.text = "Welcome to History Flashcards!"
        descriptionTextView.text = "Test your knowledge of historical facts with 5 true/false questions. Get immediate feedback and see your score at the end!"

        // Start button click handler
        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}