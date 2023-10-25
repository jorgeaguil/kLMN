package com.example.agrn

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText
    private lateinit var editTextControlNumber: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewTitle: TextView = findViewById(R.id.textViewTitle)
        editTextName = findViewById(R.id.editTextName)
        editTextControlNumber = findViewById(R.id.editTextControlNumber)
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonViewAgenda: Button = findViewById(R.id.buttonViewAgenda)

        //pasar datos a otra actividad
        buttonAdd.setOnClickListener(View.OnClickListener {
            val name = editTextName.getText().toString()
            val controlNumber = editTextControlNumber.getText().toString()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("controlNumber", controlNumber)
            startActivity(intent)
        })

        buttonAdd.setOnClickListener {
            // Aquí puedes agregar la lógica para el botón "Agregar".

        }

        buttonViewAgenda.setOnClickListener {
            // Aquí puedes agregar la lógica para el botón "Ver Agenda".
        }
    }
}
