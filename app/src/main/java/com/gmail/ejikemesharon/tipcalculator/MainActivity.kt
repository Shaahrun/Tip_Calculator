package com.gmail.ejikemesharon.tipcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var getPrice: TextInputEditText
    private lateinit var getPercentage: TextInputEditText
    private lateinit var calculateTip: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getPrice = findViewById(R.id.text_cost)
        getPercentage = findViewById(R.id.text_percent_tip)
        calculateTip = findViewById(R.id.calculate_tip_button)

        calculateTip.setOnClickListener {
            showTip()
        }
    }

    private fun showTip() {

        val price = getPrice.text.toString().toInt()
        val percent = getPercentage.text.toString().toInt()
        val getTip = price * percent / 100

        val intent = Intent(this, ShowTipActivity::class.java)
        intent.putExtra("tip_amount", getTip)
        startActivity(intent)

    }


}
