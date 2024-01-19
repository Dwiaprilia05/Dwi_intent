package com.example.dwi_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNAMA: Button = findViewById(R.id.btnNAMA)
        val btnSMK: Button = findViewById(R.id.btnSMK)

        btnNAMA.setOnClickListener{
            val intent = Intent( this,MainActivity2::class.java)
            startActivity(intent)
        }

        btnSMK.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }
    }
}