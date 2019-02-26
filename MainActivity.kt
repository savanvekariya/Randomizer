package com.example.randomizer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultTextView=findViewById<TextView>(R.id.resultTextView)
        val seekBar=findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener {

            val rand = Random.nextInt(seekBar.progress+1)
            resultTextView.text = rand.toString()
            val textView3msg = "Range 0-${seekBar.progress}"
            textView3.text = textView3msg
        }

    }
}
