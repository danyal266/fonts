package com.example.fonts

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        val german_one = Typeface.createFromAsset(assets,"fonts/JJameel Noori Kasheeda Regular.ttf")
        german.setTypeface(german_one)
        val enflish_one = Typeface.createFromAsset(assets,"fonts/JJameel Noori Kasheeda Regular.ttf")
        english.setTypeface(enflish_one)
        val urdu_one = Typeface.createFromAsset(assets,"fonts/JJameel Noori Kasheeda Regular.ttf")
        urdu.setTypeface(urdu_one)
    }
}