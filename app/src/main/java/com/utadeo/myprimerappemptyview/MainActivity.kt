package com.utadeo.myprimerappemptyview

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editTextView = findViewById<EditText>(R.id.editTextText)
        val btnEntry = findViewById<Button>(R.id.button)
        val textoSaludo = findViewById<TextView>(R.id.textView)

        btnEntry.setOnClickListener{
            textoSaludo.text = getString(R.string.tv_hola, editTextView.text.toString())
        }
    }
}