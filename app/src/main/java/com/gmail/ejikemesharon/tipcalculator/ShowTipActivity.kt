package com.gmail.ejikemesharon.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ShowTipActivity : AppCompatActivity() {

    private lateinit var tipAmount : TextView
    private lateinit var coinImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_tip)

        coinImg = findViewById(R.id.tip_image)
        tipAmount = findViewById(R.id.tip_amount)


        val tip = intent.extras?.getInt("tip_amount")
        val message = "You should definitely tip $$tip! "
        tipAmount.text = message


    }
}