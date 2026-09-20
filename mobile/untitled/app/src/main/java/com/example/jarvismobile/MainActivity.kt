package com.example.jarvismobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jarvismobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.applyButton.setOnClickListener {
            val input = binding.editTextText.text.toString()
            if (input.isNotEmpty()) {
                binding.resultText.text = "Hello, $input!"
            } else {
                binding.resultText.text = "Welcome to Jarvis Mobile!"
            }
        }
    }
}
