package com.imagine.androidtasker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val status = findViewById<TextView>(R.id.statusText)
        val button = findViewById<Button>(R.id.startButton)

        button.setOnClickListener {
            status.text = "Automação iniciada"
        }
    }
}
