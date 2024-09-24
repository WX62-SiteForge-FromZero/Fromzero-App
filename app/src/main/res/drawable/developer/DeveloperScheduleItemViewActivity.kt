package com.demo.fromzeroapp.developer

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.demo.fromzeroapp.R

class DeveloperScheduleItemViewActivity: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_item_view)

        val button=findViewById<Button>(R.id.bt_back)

        button.setOnClickListener{
            val intent= Intent(this,DeveloperHomeActivity::class.java)
            startActivity(intent)
        }
    }
}