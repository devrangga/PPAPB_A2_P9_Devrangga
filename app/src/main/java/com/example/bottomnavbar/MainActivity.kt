package com.example.bottomnavbar

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // Simulated static credentials
    private val CORRECT_USERNAME = "dep"
    private val CORRECT_PASSWORD = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.loginBtn.setOnClickListener {
            val enteredUsername = binding.loginUsername.text.toString()
            val enteredPassword = binding.loginPassword.text.toString()

            if (enteredUsername == CORRECT_USERNAME && enteredPassword == CORRECT_PASSWORD) {
                val intentToItemsActivity = Intent(this@MainActivity,MainActivityItems::class.java)
                startActivity(intentToItemsActivity)
            } else {
                showToast("Login failed. Please check your credentials.")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
