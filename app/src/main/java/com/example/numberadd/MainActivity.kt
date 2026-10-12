package com.example.numberadd

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var numA: EditText
    lateinit var numB: EditText
    lateinit var sumAB: TextView
    lateinit var sumABBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        numA = findViewById<EditText>(R.id.numA)
        numB = findViewById<EditText>(R.id.numB)
        sumAB = findViewById<TextView>(R.id.sumAB)
        sumABBtn = findViewById<Button>(R.id.sumABBtn)

        sumABBtn.setOnClickListener {
            val A = numA.text.toString().toFloat()
            val B = numB.text.toString().toFloat()
            val sum = A + B
            sumAB.text = sum.toString()
        }
    }


}