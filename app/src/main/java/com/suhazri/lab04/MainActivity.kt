package com.suhazri.lab04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.suhazri.lab04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // the step used to link the UI created in XML to our Kotlin file
        // 3 steps
        // Enable {viewbinding} in gradle.kts
        binding = ActivityMainBinding.inflate(layoutInflater) // Initialize binding object
        val view = binding.root // Initialize binding object
        setContentView(view) // Set content view to binding root

        // When buttonPlus id pressed
        binding.buttonPlus.setOnClickListener {
            //convert num1 and num2 from text to Integer
            val num1 = binding.editText1.text.toString().toDouble()
            val num2 = binding.editText2.text.toString().toDouble()
            val sum = num1 + num2; //calculate summation of num1 & num2
            binding.resultTextView.text = "Result: $sum" //show result after button pressed
        }
        binding.buttonMinus.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDouble()
            val num2 = binding.editText2.text.toString().toDouble()
            val minus = num1 - num2;
            binding.resultTextView.text = "Result: $minus" //show result after button pressed
        }
        binding.buttonProduct.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDouble()
            val num2 = binding.editText2.text.toString().toDouble()
            val product = num1 * num2;
            binding.resultTextView.text = "Result: $product" //show result after button pressed
        }
        binding.buttonDivide.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDouble()
            val num2 = binding.editText2.text.toString().toDouble()
            val divide = num1 / num2;
            binding.resultTextView.text = "Result: $divide" //show result after button pressed
        }

    }
}