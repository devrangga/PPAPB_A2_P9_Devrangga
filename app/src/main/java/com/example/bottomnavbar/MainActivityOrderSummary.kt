package com.example.bottomnavbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomnavbar.databinding.ActivityMainOrderSummaryBinding


class MainActivityOrderSummary : AppCompatActivity() {
    private lateinit var binding : ActivityMainOrderSummaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainOrderSummaryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        with(binding){
            val selectedTitle = intent.getStringExtra(MainActivityItems.TITLE)
            val selectedDate = intent.getStringExtra(MainActivityPayment.DATETIME)
            val selectedType = intent.getStringExtra(MainActivityPayment.SELECT_TYPE)
            val selectedPlace = intent.getStringExtra(MainActivityPayment.SELECTED_PLACE)
            val selectedPaymentMethod = intent.getStringExtra(MainActivityPayment.SELECTED_PAYMENT_METHOD)
            val selectedPaymentType = intent.getStringExtra(MainActivityPayment.SELECTED_PAYMENT_TYPE)

            summaryTitle.text = selectedTitle
            summaryPlace.text = selectedPlace
            summaryDate.text = selectedDate
            summaryOrderType.text= selectedType
            summaryPaymentMethod.text = selectedPaymentMethod
            summaryPaymentType.text = selectedPaymentType
        }
    }
}