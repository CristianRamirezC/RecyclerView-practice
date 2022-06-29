package com.cristiandev.recyclerview_practice.recycler.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.cristiandev.recyclerview_practice.SuperHero
import com.cristiandev.recyclerview_practice.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSuperheroBinding.bind(view)
    fun render(superHero: SuperHero) {
        binding.tvSuperHeroName.text = superHero.heroName
        binding.tvRealName.text = superHero.realName
        binding.tvPublisher.text = superHero.publisher
        Glide.with(binding.ivSuperHero.context)
            .load(superHero.photo)
            .into(binding.ivSuperHero)
    }
}