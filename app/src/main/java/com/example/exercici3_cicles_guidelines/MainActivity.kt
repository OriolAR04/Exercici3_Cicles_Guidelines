package com.example.exercici3_cicles_guidelines

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        val btnSumar: Button = findViewById(R.id.btnSumar)
        val btnRestar: Button = findViewById(R.id.btnRestar)
        val btnAugmentar: Button = findViewById(R.id.btnAugmentar)
        val btnDisminuir: Button = findViewById(R.id.btnDisminuir)
        val btnAmagar: Button = findViewById(R.id.btnAmagar)
        val btnMostrar: Button = findViewById(R.id.btnMostrar)
        val btnColorFons: Button = findViewById(R.id.btnColorFons)
        val btnColorText: Button = findViewById(R.id.btnColorText)

        btnSumar.setOnClickListener {
            counter++
            textView.text = counter.toString()
        }

        btnRestar.setOnClickListener {
            counter--
            textView.text = counter.toString()
        }

        btnAugmentar.setOnClickListener {
            textView.textSize += 2
        }

        btnDisminuir.setOnClickListener {
            textView.textSize -= 2
        }

        btnAmagar.setOnClickListener {
            textView.visibility = TextView.INVISIBLE
        }

        btnMostrar.setOnClickListener {
            textView.visibility = TextView.VISIBLE
        }

        btnColorFons.setOnClickListener {
            textView.setBackgroundColor(Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256)))
        }

        btnColorText.setOnClickListener {
            textView.setTextColor(Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256)))
        }

        Log.i("MainActivity", "onCreate")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
    }

    // Métodos del ciclo de vida y de preservación de estado como ya tienes en el código.
}
