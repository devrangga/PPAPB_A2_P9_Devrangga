package com.example.bottomnavbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.bottomnavbar.databinding.ActivityMainPaymentBinding

class MainActivityPayment : AppCompatActivity() {

    var selectedDate = ""
    lateinit var dateTime: String
    companion object {
        const val SELECT_TYPE = "selectedType"
        const val SELECTED_PLACE = "selectedPlace"
        const val SELECTED_PAYMENT_METHOD = "selectedPaymentMethod"
        const val SELECTED_PAYMENT_TYPE = "selectedPaymentType"
        const val DATEPICKER = "datePicker"
        const val DATETIME = "dateTime"
    }

    private lateinit var binding: ActivityMainPaymentBinding
    private lateinit var places: Array<String>
    private val type = arrayOf(
        "Royal Diamond",
        "Golden Gem",
        "Silver Bullet"
    )
    private val paymentMethod = arrayOf(
        "Gem Transfer",
        "Jewelry Chain",
        "Etherum"
    )
    private val paymentType = arrayOf(
        "Golden Technique",
        "Silver Technique",
        "Hardcore Technique"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPaymentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        with(binding) {
            val datePicker = datePicker
            val tahun = datePicker.year
            val bulan = datePicker.month + 1
            val hari = datePicker.dayOfMonth
            val tanggal = "$hari/$bulan/$tahun"

            val timePicker = timePicker
            val jam = timePicker.hour
            val menit = timePicker.minute
            val waktu = "$jam:$menit"
            dateTime = "$tanggal, $waktu"


            val adapterType = ArrayAdapter(
                this@MainActivityPayment, com.google.android.material
                    .R.layout.support_simple_spinner_dropdown_item, type
            )
            adapterType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerType.adapter = adapterType

            places = resources.getStringArray(R.array.places)
            val adapterPlaces = ArrayAdapter(
                this@MainActivityPayment, com.google.android.material
                    .R.layout.support_simple_spinner_dropdown_item, places
            )
            spinnerPlace.adapter = adapterPlaces

            val adapterPaymentMethod = ArrayAdapter(
                this@MainActivityPayment, com.google.android
                    .material.R.layout.support_simple_spinner_dropdown_item, paymentMethod
            )
            spinnerPaymentMethod.adapter = adapterPaymentMethod

            val adapterPaymentType = ArrayAdapter(
                this@MainActivityPayment, com.google.android
                    .material.R.layout.support_simple_spinner_dropdown_item, paymentType
            )
            spinnerPaymentType.adapter = adapterPaymentType

            orderSummary.setOnClickListener {
                val selectedType = spinnerType.selectedItem.toString()
                val selectedPlace = spinnerPlace.selectedItem.toString()
                val selectedPaymentMethod = spinnerPaymentMethod.selectedItem.toString()
                val selectedPaymentType = spinnerPaymentType.selectedItem.toString()

                val intentToOrderSummary = Intent(
                    this@MainActivityPayment,
                    MainActivityOrderSummary::class.java
                )
                intentToOrderSummary.putExtra(SELECT_TYPE, selectedType)
                intentToOrderSummary.putExtra(SELECTED_PLACE, selectedPlace)
                intentToOrderSummary.putExtra(SELECTED_PAYMENT_METHOD, selectedPaymentMethod)
                intentToOrderSummary.putExtra(SELECTED_PAYMENT_TYPE, selectedPaymentType)
                intentToOrderSummary.putExtra(DATETIME, dateTime.toString())
                startActivity(intentToOrderSummary)
            }
        }
    }
}
