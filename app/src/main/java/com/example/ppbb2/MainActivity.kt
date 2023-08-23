package com.example.ppbb2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ppbb2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            txtNumber.text = number.toString()

            txtNumber.setBackgroundResource(R.color.purple_500)
            val email = "email1"
            val pass = "pass1"

            btnGetText.setOnClickListener {
                val valueText = edtEmail.text.toString()
                Toast.makeText(
                    this@MainActivity,
                    valueText,
                    Toast.LENGTH_SHORT
                ).show()
            }

            btnCount.setOnClickListener {
                number++
                txtNumber.text = number.toString()
            }
            btnToast.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "last count: $number",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}