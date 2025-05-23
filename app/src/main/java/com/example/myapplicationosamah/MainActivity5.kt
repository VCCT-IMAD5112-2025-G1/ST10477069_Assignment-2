package com.example.myapplicationosamah

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {

    // List of quiz questions
    private val questions = listOf(
        "University of Oxford is the oldest university in the world.",
        "University of Harvard is the oldest university in United States.",
        "Is the University of Cape Town the best university in Africa.",
        "The largest country in terms of area is Russia.",
        "Cape town is the best city in the world for 2025."
    )

    // Index of the current question being displayed
    private var currentQuestionIndex = 0

    // User's score, incremented for each correct answer
    private var score = 0

    // List of correct answers corresponding to the questions
    private val answers = listOf(false, true, true, true, true) // Correct answers

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        // Initialize views from the layout
        val questionTextView = findViewById<TextView>(R.id.questionTextView)
        val trueButton = findViewById<Button>(R.id.trueButton)
        val falseButton = findViewById<Button>(R.id.falseButton)

        // Function to display the current question
        fun showQuestion() {
            if (currentQuestionIndex < questions.size) {
                questionTextView.text = questions[currentQuestionIndex]
            }
        }


        // Function to check if the user's answer is correct
        fun checkAnswer(userAnswer: Boolean) {
            val correctAnswer = answers[currentQuestionIndex]

            // If answer is correct, increment the score
            if (userAnswer == correctAnswer) {
                score++
            }

            // Move to the next question
            currentQuestionIndex++

            if (currentQuestionIndex >= questions.size) {
                // All questions answered, go to score screen
                val intent = Intent(this, ScoreActivity::class.java).apply {
                    putExtra("SCORE", score)
                    putExtra("TOTAL_QUESTIONS", questions.size)
                    putStringArrayListExtra("QUESTIONS", ArrayList(questions))
                    putExtra("ANSWERS", answers.toBooleanArray())
                }
                startActivity(intent)
                finish() // Close this activity
            } else {
                // Show the next question
                showQuestion()
            }
        }

        // Show the first question when the activity starts
        showQuestion()

        // Set up click listeners for the True and False buttons
        trueButton.setOnClickListener { checkAnswer(true) }
        falseButton.setOnClickListener { checkAnswer(false) }
    }
}