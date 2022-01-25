package com.example.secondproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.secondproj.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditBinding

    private var indexImage = 0 //для переключения картинок
    private var imageId =  R.drawable.image1
    private val imageIdList = listOf(
        R.drawable.image1, R.drawable.image2,
        R.drawable.image3, R.drawable.image4,
        R.drawable.image5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initButton()
    }

    private fun initButton() = with(binding){
        bNextImage.setOnClickListener{
            indexImage++
            if (indexImage > imageIdList.size-1) indexImage = 0
            imageId = imageIdList[indexImage]
            imageView.setImageResource(imageId)

        }
    }
}