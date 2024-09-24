package com.demo.fromzeroapp.developer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.demo.fromzeroapp.R

class DeveloperHomeActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_developer)

        val button=findViewById<Button>(R.id.bt_proyectos)

        button.setOnClickListener{
            val intent= Intent(this,DeveloperProjectsActivity::class.java)
            startActivity(intent)
        }
    }
}