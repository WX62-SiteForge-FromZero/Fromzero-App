package com.demo.fromzeroapp.developer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.demo.fromzeroapp.R

class DeveloperScheduleView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_view)

        val card=findViewById<CardView>(R.id.cv_entregable)

        card.setOnClickListener{
            val intent= Intent(this,DeveloperScheduleItemViewActivity::class.java)
            startActivity(intent)
        }
    }
}