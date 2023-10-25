package com.example.agrn

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Recuperar datos de otra actividad
        val name = intent.getStringExtra("name")
        val controlNumber = intent.getStringExtra("controlNumber")

        // Mostrar los datos en los TextView
        val textViewContactName: TextView = findViewById(R.id.textViewContactName)
        textViewContactName.text = "Nombre del contacto: $name\nNúmero de control: $controlNumber"

        // Listener para el botón "Salir"
        val buttonExit = findViewById<Button>(R.id.buttonExit)
        buttonExit.setOnClickListener {
            finish()
        }
    }
}
