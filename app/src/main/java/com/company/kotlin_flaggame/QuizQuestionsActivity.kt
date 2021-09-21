package com.company.kotlin_flaggame

import android.annotation.SuppressLint
import android.app.ActionBar.DISPLAY_SHOW_CUSTOM
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionsActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val message = intent.getStringExtra("NAME")
        if (message != null) {
            Log.i("name", message)
        }

        supportActionBar!!.displayOptions = DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setCustomView(R.layout.title_bar)
    }
}