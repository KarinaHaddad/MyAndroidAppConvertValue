package com.example.converter

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    @SuppressLint("DefaultLocale", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val num = binding.numberUsd.text.toString().toDouble()
            val result = String.format("%.2f", (num * 5.8))
            binding.resultBrl.text = "$result $"
        }

        binding.button2.setOnClickListener {
            val num = binding.numberReal.text.toString().toDouble()
            val result = String.format("%.2f", (num / 5.8))
            binding.resultUsd.text = "R$ $result"
        }
    }
}