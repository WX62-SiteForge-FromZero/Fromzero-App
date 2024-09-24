package com.demo.fromzeroapp.developer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.demo.fromzeroapp.R

class DeveloperProjectsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects_developer)

        val card=findViewById<CardView>(R.id.cv_3)

        card.setOnClickListener{
            val intent= Intent(this,DeveloperScheduleView::class.java)
            startActivity(intent)
        }

    }
}