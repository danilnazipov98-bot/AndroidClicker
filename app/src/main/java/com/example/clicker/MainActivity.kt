package com.example.clicker

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    private var count = 0
    private lateinit var counter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
        }
        val title = TextView(this).apply {
            text = "Мой кликер"
            textSize = 30f
            gravity = Gravity.CENTER
        }
        counter = TextView(this).apply {
            text = "Кликов: 0"
            textSize = 24f
            gravity = Gravity.CENTER
            setPadding(0, 32, 0, 32)
        }
        val clickButton = Button(this).apply {
            text = "НАЖМИ МЕНЯ"
            textSize = 20f
            setOnClickListener {
                count++
                counter.text = "Кликов: $count"
            }
        }
        val resetButton = Button(this).apply {
            text = "Сбросить"
            setOnClickListener {
                count = 0
                counter.text = "Кликов: 0"
            }
        }
        layout.addView(title)
        layout.addView(counter)
        layout.addView(clickButton)
        layout.addView(resetButton)
        setContentView(layout)
    }
}
