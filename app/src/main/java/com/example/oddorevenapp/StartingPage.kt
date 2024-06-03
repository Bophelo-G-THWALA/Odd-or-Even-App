package com.example.oddorevenapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starting_page)

        val NumberInput = findViewById<EditText>(R.id.NumberInput).text

        val Output = findViewById<TextView>(R.id.Output)

        val OutputButton = findViewById<Button>(R.id.OutputButton)



        OutputButton.setOnClickListener {

            val inputString = NumberInput.toString()
            val input = inputString.toIntOrNull()

            if (input != null) {
                if (input % 2 == 0) {
                    Output.text = "The number entered is an even number."
                } else {
                    Output.text = "The number is odd."
                    }
                } else {
                    Output.text = "Please enter a valid number."
                }
            }
        }
    }



