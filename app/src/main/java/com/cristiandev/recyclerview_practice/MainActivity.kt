package com.cristiandev.recyclerview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.cristiandev.recyclerview_practice.databinding.ActivityMainBinding
import com.cristiandev.recyclerview_practice.recycler.adapter.SuperHeroAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperHero.adapter =
            SuperHeroAdapter(SuperHeroProvider.superHeroList) { superHero ->
                onItemSelected(superHero)
            }
    }

    private fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.heroName, Toast.LENGTH_SHORT).show()
    }
}