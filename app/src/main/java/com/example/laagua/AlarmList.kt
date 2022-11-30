package com.example.laagua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.beber_agua.R


class AlarmList : AppCompatActivity() {

    private lateinit var buttonBackRef : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_list)
//      hides status bar on app load
        supportActionBar!!.hide()
        fun goToSettingsPage() {
            var homeScreen = Intent(this, MainActivity::class.java)
            startActivity(homeScreen)
        }

        buttonBackRef  = findViewById(R.id.imageViewBackIcon)

        buttonBackRef.setOnClickListener{
            goToSettingsPage()
        }
    }
}