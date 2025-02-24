package com.example.exercici3_cicles_guidelines

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var mainLayout: ConstraintLayout
    private var counter: Int = 0
    private var textColor: Int = Color.BLACK
    private var backgroundColor: Int = Color.WHITE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView3)
        mainLayout = findViewById(R.id.main)
        val btnSumar: Button = findViewById(R.id.button9)
        val btnRestar: Button = findViewById(R.id.button8)
        val btnAugmentar: Button = findViewById(R.id.button10)
        val btnDisminuir: Button = findViewById(R.id.button11)
        val btnAmagar: Button = findViewById(R.id.button13)
        val btnMostrar: Button = findViewById(R.id.button12)
        val btnColorFons: Button = findViewById(R.id.button2)
        val btnColorText: Button = findViewById(R.id.button)

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
            backgroundColor = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            mainLayout.setBackgroundColor(backgroundColor)
        }

        btnColorText.setOnClickListener {
            textColor = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            textView.setTextColor(textColor)
        }

        Log.i("MainActivity", "onCreate")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter", counter)
        outState.putInt("textColor", textColor)
        outState.putInt("backgroundColor", backgroundColor)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counter = savedInstanceState.getInt("counter", 0)
        textColor = savedInstanceState.getInt("textColor", Color.BLACK)
        backgroundColor = savedInstanceState.getInt("backgroundColor", Color.WHITE)
        textView.text = counter.toString()
        textView.setTextColor(textColor)
        mainLayout.setBackgroundColor(backgroundColor)
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}
