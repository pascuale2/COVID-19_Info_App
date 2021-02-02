package com.example.hackathon_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   fun goToMaps(view: View) {
       val intent = Intent(this, Map::class.java)
       startActivity(intent)
   }

    fun goToCalendar(view: View) {
        val intent = Intent(this, Calendar::class.java)
        startActivity(intent)
    }

    fun goToStatistics(view: View) {
        val intent = Intent(this, Statistics::class.java)
        startActivity(intent)
    }

    fun goToInfo(view: View) {
        val intent = Intent(this, Info::class.java)
        startActivity(intent)
    }

    fun goToAge(view: View) {
        val intent = Intent(this, Age::class.java)
        startActivity(intent)
    }
}