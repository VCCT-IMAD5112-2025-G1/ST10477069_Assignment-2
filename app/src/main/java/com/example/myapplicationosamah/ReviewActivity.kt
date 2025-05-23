package com.example.myapplicationosamah

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ReviewActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val questions = intent.getStringArrayListExtra("QUESTIONS") ?: ArrayList()
        val answers = intent.getBooleanArrayExtra("ANSWERS") ?: booleanArrayOf()

        val reviewTextView = findViewById<TextView>(R.id.reviewTextView)

        val reviewText = StringBuilder()
        for ((index, question) in questions.withIndex()) {
            reviewText.append("${index + 1}. $question\n")
            reviewText.append("Correct answer: ${if (answers[index]) "True" else "False"}\n\n")
        }

        reviewTextView.text = reviewText.toString()
    }
}