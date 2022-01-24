package com.example.secondproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.secondproj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter = RecipeAdapter()
    private val imageId = listOf(
        R.drawable.image1, R.drawable.image2,
        R.drawable.image3, R.drawable.image4,
        R.drawable.image5)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }
    private fun init(){ // инициализируем recyclerView
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@MainActivity, 2)
            rcView.adapter = adapter
            buttonAd.setOnClickListener{
                if (index > 4) index = 0
                val recipe =  Recipe(imageId[index],"recipe ${index+1}")
                adapter.addRecipe(recipe)
                index++
            }
        }
    }
}