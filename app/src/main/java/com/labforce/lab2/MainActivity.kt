package com.labforce.lab2

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.math.BigInteger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberInput = findViewById<EditText>(R.id.numberInput)
        val checkFactorialBtn = findViewById<Button>(R.id.checkFactorialBtn)

        checkFactorialBtn.setOnClickListener {
            val numberText = numberInput.text.toString()
            val n = numberText.toIntOrNull()


            val fact = factorial(n)

            var found = false
            for (i in 1..fact.toInt()) {
                if (BigInteger.valueOf(i.toLong())
                        .multiply(BigInteger.valueOf(i + 1L))
                        .multiply(BigInteger.valueOf(i + 2L)) == fact
                ) {
                    found = true
                    break
                }
            }

        }
    }