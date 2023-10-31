package com.example.bottomnavbar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavbar.databinding.ActivityMainDetailBinding

class MainActivityDetail : AppCompatActivity() {
    private  lateinit var binding : ActivityMainDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val imgSrc = intent.getStringExtra(MainActivityItems.IMG_SRC)
        val imgResource = resources.getIdentifier(imgSrc, "drawable", packageName)
        val rate = intent.getStringExtra(MainActivityItems.RATE)
        val title = intent.getStringExtra(MainActivityItems.TITLE)

        with(binding){
            detailImage.setImageResource(imgResource)
            detailRate.text = rate
            detailTitle.text = title

            getTickets.setOnClickListener{
                val intentToPayment = Intent(this@MainActivityDetail,MainActivityPayment::class.java)
                startActivity(intentToPayment)
            }

            arrowBack.setOnClickListener{
                val intentBack = Intent(this@MainActivityDetail,MainActivityItems::class.java)
                startActivity(intentBack)
            }
        }

    }
}