package com.cristiandev.recyclerview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cristiandev.recyclerview_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}