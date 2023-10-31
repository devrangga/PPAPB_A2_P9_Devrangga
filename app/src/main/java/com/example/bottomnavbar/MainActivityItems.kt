package com.example.bottomnavbar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavbar.databinding.ActivityMainItemsBinding

class MainActivityItems : AppCompatActivity() {

    private lateinit var binding: ActivityMainItemsBinding

    companion object {
        const val IMG_SRC = "img_src"
        const val RATE = "rate"
        const val TITLE = "title"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainItemsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

         val imgOne = "@drawable/imgone"
         val imgtwo = "@drawable/imgtwo"
         val imgThree = "@drawable/imgthree"
         val imgFour = "@drawable/imgfour"

         val titleImgOne = "Asik Liburan"
         val titleImgtwo = "Mayan Sokin"
         val titleImgThree = "Mayan lah ye"
         val titleImgFour = "Rada kureng"

         val rateImgOne = "5"
         val rateImgtwo = "4"
         val rateImgThree = "3"
         val rateImgFour = "2"

        binding.cardOne.setOnClickListener {
            val intentToDetailItem = Intent(this@MainActivityItems,MainActivityDetail::class.java)
            intentToDetailItem.putExtra(IMG_SRC,imgOne)
            intentToDetailItem.putExtra(RATE,rateImgOne)
            intentToDetailItem.putExtra(TITLE,titleImgOne)
            startActivity(intentToDetailItem)
        }

        binding.cardTwo.setOnClickListener {
            val intentToDetailItem = Intent(this@MainActivityItems,MainActivityDetail::class.java)
            intentToDetailItem.putExtra(IMG_SRC,imgtwo)
            intentToDetailItem.putExtra(RATE,rateImgtwo)
            intentToDetailItem.putExtra(TITLE,titleImgtwo)
            startActivity(intentToDetailItem)
        }

        binding.cardThree.setOnClickListener {
            val intentToDetailItem = Intent(this@MainActivityItems,MainActivityDetail::class.java)
            intentToDetailItem.putExtra(IMG_SRC,imgThree)
            intentToDetailItem.putExtra(RATE,rateImgThree)
            intentToDetailItem.putExtra(TITLE,titleImgThree)
            startActivity(intentToDetailItem)
        }

        binding.cardFour.setOnClickListener {
            val intentToDetailItem = Intent(this@MainActivityItems,MainActivityDetail::class.java)
            intentToDetailItem.putExtra(IMG_SRC,imgFour)
            intentToDetailItem.putExtra(RATE,rateImgFour)
            intentToDetailItem.putExtra(TITLE,titleImgFour)
            startActivity(intentToDetailItem)
        }

        binding.cardFive.setOnClickListener {
            val intentToDetailItem = Intent(this@MainActivityItems,MainActivityDetail::class.java)
            intentToDetailItem.putExtra(IMG_SRC,imgOne)
            intentToDetailItem.putExtra(RATE,rateImgOne)
            intentToDetailItem.putExtra(TITLE,titleImgOne)
            startActivity(intentToDetailItem)
        }

        binding.cardSix.setOnClickListener {
            val intentToDetailItem = Intent(this@MainActivityItems,MainActivityDetail::class.java)
            intentToDetailItem.putExtra(IMG_SRC,imgtwo)
            intentToDetailItem.putExtra(RATE,rateImgtwo)
            intentToDetailItem.putExtra(TITLE,titleImgtwo)
            startActivity(intentToDetailItem)
        }

    }
}
