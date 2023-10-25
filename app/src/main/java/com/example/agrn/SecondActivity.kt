package com.example.agrn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //recuperar datos de otra actividad
        val intent = intent
        val name = intent.getStringExtra("name")
        val controlNumber = intent.getStringExtra("controlNumber")
    }
}
