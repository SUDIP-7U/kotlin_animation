package com.example.kotlinanimaton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btnClick)
        textView = findViewById(R.id.myTextView)
        imageView = findViewById(R.id.iv_image)

        // Example of animating a Button
        button.setOnClickListener {
            it.animate()
                .rotationBy(360f) // Rotate by 360 degrees
                .scaleX(1.5f) // Scale horizontally by 1.5 times
                .scaleY(1.5f) // Scale vertically by 1.5 times
                .setDuration(1000) // Animation duration in milliseconds
                .start()
        }

        // Example of animating a TextView
        textView.setOnClickListener {
            it.animate()
                .alpha(0f) // Make it transparent
                .translationYBy(200f) // Move down by 200 pixels
                .setDuration(1000)
                .start()
        }

        // Example of animating an ImageView
        imageView.setOnClickListener {
            it.animate()
                .rotation(180f) // Rotate to 180 degrees
                .scaleX(0.5f) // Shrink horizontally by half
                .scaleY(0.5f) // Shrink vertically by half
                .setDuration(1000)
                .start()
        }
    }
}
