package com.example.myapplicationosamah

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        // Get data from intent
        val score = intent.getIntExtra("SCORE", 0)
        val totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS", 0)
        val questions = intent.getStringArrayListExtra("QUESTIONS") ?: ArrayList()
        val answers = intent.getBooleanArrayExtra("ANSWERS") ?: booleanArrayOf()

        // Initialize views
        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        val feedbackTextView = findViewById<TextView>(R.id.feedbackTextView)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        // Display score

        scoreTextView.text = "Your Score: $score/$totalQuestions"

        // Provide feedback based on score
        val feedback = when {
            score >= 4 -> "Excellent work! You're a history expert!"
            score >= 2 -> "Good job! Keep practicing to improve!"
            else -> "Keep studying! You'll get better!"
        }
        feedbackTextView.text = feedback

        // Review button shows all questions and correct answers
        reviewButton.setOnClickListener {
            val reviewIntent = Intent(this, ReviewActivity::class.java).apply {
                putStringArrayListExtra("QUESTIONS", questions)
                putExtra("ANSWERS", answers)
            }
            startActivity(reviewIntent)
        }

        // Exit button closes the app
        exitButton.setOnClickListener {
            finishAffinity() // Close all activities and exit app
        }
    }
}